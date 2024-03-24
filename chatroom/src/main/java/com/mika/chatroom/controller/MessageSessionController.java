package com.mika.chatroom.controller;


import com.mika.chatroom.constant.Constant;
import com.mika.chatroom.model.Friend;
import com.mika.chatroom.model.MessageSession;
import com.mika.chatroom.model.MessageSessionUserItem;
import com.mika.chatroom.model.User;
import com.mika.chatroom.service.MessageService;
import com.mika.chatroom.service.MessageSessionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/messageSession")
public class MessageSessionController {

    @Autowired
    private MessageSessionService messageSessionService;

    @Autowired
    private MessageService messageService;


    @RequestMapping("/getSessionList")
    public List<MessageSession> getSessionList(HttpServletRequest request) {
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
        // 获取到会话
        List<Integer> sessionIds = messageSessionService.getSessionIdByUserId(user.getUserId());
        List<MessageSession> ret = new ArrayList<>();
        for (Integer sessionId : sessionIds) {
            // 获取到每一个会话的 id，朋友信息，以及会话中的最后一条消息
            MessageSession messageSession = new MessageSession();
            messageSession.setSessionId(sessionId);
            List<Friend> friends = messageSessionService.getFriendBySessionId(sessionId, user.getUserId());
            messageSession.setFriends(friends);
            String lastMessage = messageService.getLastMessageBySessionId(sessionId);
            if (!StringUtils.hasLength(lastMessage)) {
                messageSession.setLastMessage("");
            } else {
                messageSession.setLastMessage(lastMessage);
            }
            ret.add(messageSession);
        }
        return ret;
    }

    @Transactional
    @RequestMapping("/createSession")
    public Integer addMessageSession(Integer toUserId, @SessionAttribute(Constant.USER_SESSION) User user) {
        if (toUserId == null || toUserId < 1 || user == null || user.getUserId() < 1) {
            log.error("toUserId 不合法，toUserId: " + toUserId);
            return null;
        }
        // 使用这个参数的目的是为了获取 sessionId (主键)
        MessageSession messageSession = new MessageSession();
        // 新增会话
        Integer ret = messageSessionService.addMessageSession(messageSession);
        if (ret < 1 || messageSession.getSessionId() < 1) {
            log.error("新增会话失败");
            return null;
        }
        MessageSessionUserItem item1 = new MessageSessionUserItem(messageSession.getSessionId(), toUserId);
        MessageSessionUserItem item2 = new MessageSessionUserItem(messageSession.getSessionId(), user.getUserId());
        // 新增会话的用户信息
        Integer ret2 = messageSessionService.addMessageSessionUser(item1);
        Integer ret3 = messageSessionService.addMessageSessionUser(item2);
        if (ret2 < 1 || ret3 < 1) {
            log.error("新增会话的用户信息失败, ret2: " + ret2 + ", ret3: " + ret3);
            return null;
        }
        return messageSession.getSessionId();

    }
}
