package com.mika.chatroom.model;


import lombok.Data;

// 表示一个 WebSocket 响应
@Data
public class MessageResponse {
    private String type = "message"; // 针对 websocket 中传输的数据做个简单的区分
    private Integer fromId; // 消息发送者的用户 id
    private String fromName;  // 消息发送者的用户名
    private Integer sessionId; // 当前消息是发给哪个对话的
    private String content; // 消息内容


    public MessageResponse() {
    }

    public MessageResponse(Integer fromId, String fromName, Integer sessionId, String content) {
        this.fromId = fromId;
        this.fromName = fromName;
        this.sessionId = sessionId;
        this.content = content;
    }
}
