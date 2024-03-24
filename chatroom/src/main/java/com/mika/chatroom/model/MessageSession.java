package com.mika.chatroom.model;

import lombok.Data;

import java.util.List;

@Data
public class MessageSession {
    private Integer sessionId;
    private List<Friend> friends;
    private String lastMessage;
}
