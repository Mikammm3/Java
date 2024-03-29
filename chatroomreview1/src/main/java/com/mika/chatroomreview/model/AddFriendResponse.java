package com.mika.chatroomreview.model;

import com.mika.chatroomreview.constant.Constant;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddFriendResponse {
    private String type = Constant.ADD_FRIEND_REQUIRE;
    private String addReason;
    private Integer friendId;
    private String fromName;
    private Integer fromId;

    public AddFriendResponse(String addReason, Integer friendId, String fromName, Integer fromId) {
        this.addReason = addReason;
        this.friendId = friendId;
        this.fromName = fromName;
        this.fromId = fromId;
    }

    // 用来处理接受/拒绝好友申请
    private String friendName;

    public AddFriendResponse(String type, Integer fromId, String friendName) {
        this.type = type;
        this.fromId = fromId;
        this.friendName = friendName;
    }
}
