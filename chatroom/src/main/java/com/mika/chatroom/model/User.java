package com.mika.chatroom.model;

import lombok.Data;

@Data
public class User {
    private Integer userId;
    private String userName;
    private String password;

    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
