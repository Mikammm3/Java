package com.mika.chatroom.controller;

import com.mika.chatroom.model.Message;
import com.mika.chatroom.service.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageService;


    @RequestMapping("/getMessageList")
    public List<Message> getMessageListBySessionId(Integer sessionId) {
        if (sessionId == null || sessionId < 1) {
            log.error("sessionId 不合法, sessionId: " + sessionId);
            return null;
        }
        // 针对查询结果，进行逆序
        List<Message> messageList = messageService.getMessageListBySessionId(sessionId);
        Collections.reverse(messageList);
        return messageList;
    }

}
