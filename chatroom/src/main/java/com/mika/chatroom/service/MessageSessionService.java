package com.mika.chatroom.service;

import com.mika.chatroom.mapper.MessageSessionMapper;
import com.mika.chatroom.model.Friend;
import com.mika.chatroom.model.MessageSession;
import com.mika.chatroom.model.MessageSessionUserItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageSessionService {

    @Autowired
    private MessageSessionMapper messageSessionMapper;

    public List<Integer> getSessionIdByUserId(Integer userId) {
        return messageSessionMapper.getSessionIdByUserId(userId);
    }

    public List<Friend> getFriendBySessionId(Integer sessionId, Integer userId) {
        return messageSessionMapper.getFriendBySessionId(sessionId, userId);
    }

    public Integer addMessageSession(MessageSession messageSession) {
        return messageSessionMapper.addMessageSession(messageSession);
    }

    public Integer addMessageSessionUser(MessageSessionUserItem messageSessionUserItem) {
        return messageSessionMapper.addMessageSessionUser(messageSessionUserItem);
    }
}
