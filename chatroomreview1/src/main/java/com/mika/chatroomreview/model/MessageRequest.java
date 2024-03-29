package com.mika.chatroomreview.model;

import lombok.Data;

@Data
public class MessageRequest {
    private String type = "message";
    private Integer sessionId;
    private String content;

    // 用来处理 添加好友请求 的属性
    private String addReason;
    private Integer friendId;

    // 用来处理 接受好友请求
    private Integer fromId;
    private String friendName;

}
