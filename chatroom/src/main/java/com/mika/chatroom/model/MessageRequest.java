package com.mika.chatroom.model;

import lombok.Data;

// 表示一个 WebSocket 请求
@Data
public class MessageRequest {

    // 发送消息属性
    private String type = "message"; // 针对 websocket 中传输的数据做个简单的区分
    private Integer sessionId; // 当前消息是发给哪个对话的
    private String content; // 消息内容


    // 添加好友属性
    private String addReason;
    private Integer friendId;

    // 接受好友申请属性
    private Integer fromId;
    private String friendName;
}
