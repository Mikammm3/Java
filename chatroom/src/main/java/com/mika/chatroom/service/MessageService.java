package com.mika.chatroom.service;


import com.mika.chatroom.mapper.MessageMapper;
import com.mika.chatroom.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageMapper mapper;

    public String getLastMessageBySessionId(Integer sessionId) {
        return mapper.getLastMessageBySessionId(sessionId);
    }


    public List<Message> getMessageListBySessionId(Integer sessionId) {
        return mapper.getMessageListBySessionId(sessionId);
    }
}
