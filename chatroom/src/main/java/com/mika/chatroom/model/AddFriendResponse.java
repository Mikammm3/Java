package com.mika.chatroom.model;

import lombok.Data;

@Data

public class AddFriendResponse {
    private String type = "addFriendRequire";
    private String addReason;
    private Integer friendId;
    private Integer fromId;
    private String fromName;

    // 接受好友请求
    private String friendName; // 好友申请接收者名字

    public AddFriendResponse() {
    }

    public AddFriendResponse(String addReason, Integer friendId, Integer fromId, String fromName) {
        this.addReason = addReason;
        this.friendId = friendId;
        this.fromId = fromId;
        this.fromName = fromName;
    }

    public AddFriendResponse(Integer fromId, String friendName) {
        this.fromId = fromId;
        this.friendName = friendName;
    }
}
