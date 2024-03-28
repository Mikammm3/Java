package com.mika.chatroomreview.controller;

import com.mika.chatroomreview.constant.Constant;
import com.mika.chatroomreview.model.Friend;
import com.mika.chatroomreview.model.MessageSession;
import com.mika.chatroomreview.model.User;
import com.mika.chatroomreview.service.MessageSessionService;
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

@RestController
@RequestMapping("/messageSession")
public class MessageSessionController {
    @Autowired
    private MessageSessionService messageSessionService;


    @RequestMapping("/getSessionList")
    public List<MessageSession> getSessionList(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null) {
            return null;
        }
        User user = (User) session.getAttribute(Constant.USER_SESSION);
        if (user == null) return null;

        List<Integer> sessionIds = messageSessionService.getSessionByUserId(user.getUserId());
        List<MessageSession> ret = new ArrayList<>();

        for (Integer sessionId : sessionIds) {
            MessageSession messageSession = new MessageSession();
            messageSession.setSessionId(sessionId);
            List<Friend> friends = messageSessionService.getFriendsBySessionId(sessionId, user.getUserId());
            messageSession.setFriends(friends);
            String lastMessage = messageSessionService.getLastMessageBySessionId(sessionId);

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
        if (toUserId == null || toUserId < 1 || user == null || user.getUserId() < 1) return null;
        // 新增会话
        MessageSession messageSession = new MessageSession();
        Integer ret1 = messageSessionService.addMessageSession(messageSession);
        if (ret1 == null || ret1 < 1 || messageSession.getSessionId() == null) return null;
        // 插入会话信息
        Integer ret2 = messageSessionService.addMessageSessionUser(messageSession.getSessionId(), toUserId);
        Integer ret3 = messageSessionService.addMessageSessionUser(messageSession.getSessionId(), user.getUserId());
        if (ret2 + ret3 < 2) return null;

        return messageSession.getSessionId();
    }
}
