package com.example.demo.service;

import com.example.demo.mapper.MessageMapper;
import com.example.demo.model.MessageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageMapper mapper;

    public Integer insertMessage(MessageInfo messageInfo) {
        return mapper.insertMessage(messageInfo);
    }

    public List<MessageInfo> queryList() {
        return mapper.queryMessageList();
    }
}
