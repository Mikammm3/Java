package com.mika.chatroom.model;

import lombok.Data;

@Data
public class Message {
    private Integer messageId;
    private Integer fromId;
    private String fromName;
    private Integer sessionId;
    private String content;
}
