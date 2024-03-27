package com.mika.chatroom.model;

import lombok.Data;

@Data
public class AddFriendRequest {
    private String type = "addFriendRequire";
    private String addReason;
    private Integer friendId;
    private Integer fromId;

    // 接受好友申请
    private String friendName; // 想要添加的好友名字
}
