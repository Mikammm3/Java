package com.mika.chatroom.model;

import lombok.Data;

@Data
public class Message {
    private Integer messageId;
    private Integer fromId;
    private String fromName;
    private Integer sessionId;
    private String content;

    public Message() {
    }

    public Message(Integer fromId, String fromName, Integer sessionId, String content) {
        this.fromId = fromId;
        this.fromName = fromName;
        this.sessionId = sessionId;
        this.content = content;
    }
}
