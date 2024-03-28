package com.mika.chatroomreview.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Message {
    private Integer messageId;
    private Integer fromId;
    private String fromName;
    private Integer sessionId;
    private String content;
    private Date postTime;

    public Message(Integer fromId, String fromName, Integer sessionId, String content) {
        this.fromId = fromId;
        this.fromName = fromName;
        this.sessionId = sessionId;
        this.content = content;
    }
}
