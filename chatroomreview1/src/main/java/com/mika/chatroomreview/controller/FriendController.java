package com.mika.chatroomreview.controller;

import com.mika.chatroomreview.constant.Constant;
import com.mika.chatroomreview.model.AddFriend;
import com.mika.chatroomreview.model.Friend;
import com.mika.chatroomreview.model.User;
import com.mika.chatroomreview.service.FriendService;
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
            return null;
        }
        User user = (User) session.getAttribute(Constant.USER_SESSION);
        if (user == null) return null;
        return friendService.getFriendsByUserId(user.getUserId());

    }

    @RequestMapping("/add")
    public Integer addFriendRequire(String reason, Integer friendId, HttpServletRequest request) {
        // 首先判断是否登录
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
        // 先看看数据库中是否已经是好友关系了，如果是，那就不用添加了
        Friend friendShip = friendService.isFriendShip(user.getUserId(), friendId);
        if (friendShip != null && friendShip.getFriendId() > 0) {
            return null;
        }
        // 再看看好友申请是否已经在数据库中存在
        AddFriend sameAddFriend = friendService.FindSameAddFriendRequired(user.getUserId(), friendId);
        if (sameAddFriend != null) return null;
        // 存储好友申请
        Integer result = friendService.addFriendRequired(reason, user.getUserId(), friendId);
        if (result > 0) return user.getUserId();
        log.info("添加好友申请到数据库中失败");
        return null;
    }

    @RequestMapping("/getAddRequire")
    public List<AddFriend> getAddRequire(HttpServletRequest request) {
        // 首先判断是否登录
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
        // 根据 target_id 查找数据库
        List<AddFriend> addRequires = friendService.getAddRequire(user.getUserId());
        return addRequires;
    }

    @Transactional
    @RequestMapping("/acceptAddFriend")
    public Boolean acceptAddFriend(Integer fromId, HttpServletRequest request) {
        // 首先判断是否登录和校验参数
        HttpSession session = request.getSession(false);
        if (session == null || fromId == null) {
            log.error("用户未登录!");
            return null;
        }
        User user = (User) session.getAttribute(Constant.USER_SESSION);
        if (user == null || user.getUserId() < 1) {
            log.error("用户未登录!");
            return null;
        }
        // 添加好友关系
        Integer ret1 = friendService.insertFriend(user.getUserId(), fromId);
        Integer ret2 = friendService.insertFriend(fromId, user.getUserId());
        // 删除好友申请记录
        Integer ret3 = friendService.deleteAddFriendRequire(fromId, user.getUserId());
        if (ret1 + ret2 + ret3 >= 3) return true;
        return false;
    }

    @Transactional
    @RequestMapping("/rejectAddFriend")
    public Boolean rejectAddFriend(Integer fromId, HttpServletRequest request) {
        // 首先判断是否登录和校验参数
        HttpSession session = request.getSession(false);
        if (session == null || fromId == null) {
            log.error("用户未登录!");
            return null;
        }
        User user = (User) session.getAttribute(Constant.USER_SESSION);
        if (user == null || user.getUserId() < 1) {
            log.error("用户未登录!");
            return null;
        }

        // 删除好友申请记录
        Integer ret = friendService.deleteAddFriendRequire(fromId, user.getUserId());
        if (ret > 0) return true;
        return false;
    }
}
