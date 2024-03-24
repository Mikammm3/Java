package com.mika.chatroom.model;

import lombok.Data;


// 对应数据库中的 message_session_user
@Data
public class MessageSessionUserItem {
    private Integer sessionId;
    private Integer userId;

    public MessageSessionUserItem(Integer sessionId, Integer userId) {
        this.sessionId = sessionId;
        this.userId = userId;
    }

    public MessageSessionUserItem() {
    }
}
