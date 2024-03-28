package com.mika.chatroomreview.service;

import com.mika.chatroomreview.mapper.MessageSessionMapper;
import com.mika.chatroomreview.model.Friend;
import com.mika.chatroomreview.model.MessageSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageSessionService {
    @Autowired
    private MessageSessionMapper messageSessionMapper;

    public List<Integer> getSessionByUserId(Integer userId) {
        return messageSessionMapper.getSessionByUserId(userId);
    }

    public List<Friend> getFriendsBySessionId(Integer sessionId, Integer userId) {
        return messageSessionMapper.getFriendsBySessionId(sessionId, userId);
    }

    public String getLastMessageBySessionId(Integer sessionId) {
        return messageSessionMapper.getLastMessageBySessionId(sessionId);
    }

    public Integer addMessageSession(MessageSession messageSession) {
        return messageSessionMapper.addMessageSession(messageSession);
    }

    public Integer addMessageSessionUser(Integer sessionId, Integer userId) {
        return messageSessionMapper.addMessageSessionUser(sessionId, userId);
    }
}
