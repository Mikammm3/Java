package com.mika.chatroom.controller;

import com.mika.chatroom.constant.Constant;
import com.mika.chatroom.model.AddFriend;
import com.mika.chatroom.model.Friend;
import com.mika.chatroom.model.User;
import com.mika.chatroom.service.FriendService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@Slf4j
@RestController
@RequestMapping("/friend")
public class FriendController {

    @Autowired
    private FriendService friendService;

    @RequestMapping("/getFriendList")
    public List<Friend> getFriendList(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null) {
            log.error("用户未登录!");
            return null;
        }
        User user = (User) session.getAttribute(Constant.USER_SESSION);
        if (user == null || user.getUserId() < 1) {
            log.error("用户未登录!");
            return null;
        }

        List<Friend> friends = friendService.selectFriendList(user.getUserId());
        return friends;
    }

    // 如果成功，则返回申请者ID
    @RequestMapping("/add")
    public Integer addFriendRequire(String reason, Integer friendId, HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null) {
            log.error("用户未登录!");
            return null;
        }
        User user = (User) session.getAttribute(Constant.USER_SESSION);
        if (user == null || user.getUserId() < 1) {
            log.error("用户未登录!");
            return null;
        }
        // 先看看数据库中 friendId 与 userId 是否已经是好友关系，如果是，则添加失败
        Friend friendShip = friendService.isFriendShip(user.getUserId(), friendId);
        if (friendShip != null && friendShip.getFriendId() > 0) return null;
        AddFriend sameAddFriend = friendService.FindSameAddFriendRequired(user.getUserId(), friendId);
        if (sameAddFriend != null) return null;
        Integer result = friendService.addFriendRequired(reason, user.getUserId(), friendId);
        if (result > 0) return user.getUserId();
        return null;
    }

    @RequestMapping("/getAddRequire")
    public List<AddFriend> getAddRequire(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null) {
            log.error("用户未登录!");
            return null;
        }
        User user = (User) session.getAttribute(Constant.USER_SESSION);
        if (user == null || user.getUserId() < 1) {
            log.error("用户未登录!");
            return null;
        }

        List<AddFriend> addFriendRequires = friendService.getAddFriendRequireById(user.getUserId());
        if (addFriendRequires == null || addFriendRequires.size() == 0) {
            log.info("当前用户没有好友申请");
            return null;
        }
        return addFriendRequires;
    }

    @Transactional
    @RequestMapping("/acceptAddFriend")
    public Boolean acceptAddFriend(Integer fromId, HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null) {
            log.error("用户未登录!");
            return null;
        }
        User user = (User) session.getAttribute(Constant.USER_SESSION);
        if (user == null || user.getUserId() < 1) {
            log.error("用户未登录!");
            return null;
        }
        // 接受好友申请
        // 将 fromId 与 user 的关系添加进数据库中，然后再将 fromId 的好友申请记录删除
        Integer ret1 = friendService.addFriend(user.getUserId(), fromId);
        Integer ret2 = friendService.addFriend(fromId, user.getUserId());
        Integer ret3 = friendService.deleteAddFriendRequire(fromId, user.getUserId());
        if (ret1 + ret2 + ret3 >= 3) {
            return true;
        }
        return false;
    }


    @RequestMapping("/rejectAddFriend")
    public Boolean rejectAddFriend(Integer fromId, HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null) {
            log.error("用户未登录!");
            return null;
        }
        User user = (User) session.getAttribute(Constant.USER_SESSION);
        if (user == null || user.getUserId() < 1) {
            log.error("用户未登录!");
            return null;
        }
        // 删除好友申请
        Integer ret = friendService.deleteAddFriendRequire(fromId, user.getUserId());
        if (ret > 0) {
            return true;
        }
        return false;
    }
}
