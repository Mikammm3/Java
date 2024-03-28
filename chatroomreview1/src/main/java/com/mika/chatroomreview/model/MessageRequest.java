package com.mika.chatroomreview.model;

import lombok.Data;

@Data
public class MessageRequest {
    private String type = "message";
    private Integer sessionId;
    private String content;
}
