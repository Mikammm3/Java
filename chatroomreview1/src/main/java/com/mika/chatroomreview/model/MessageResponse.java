package com.mika.chatroomreview.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MessageResponse {
    // 可以想想前端页面需要展示什么
    private String type = "message";
    private Integer fromId;
    private String fromName;
    private Integer sessionId;
    private String content;

    public MessageResponse(Integer fromId, String fromName, Integer sessionId, String content) {
        this.fromId = fromId;
        this.fromName = fromName;
        this.sessionId = sessionId;
        this.content = content;
    }
}
