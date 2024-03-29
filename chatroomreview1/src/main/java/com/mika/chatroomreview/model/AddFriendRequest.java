package com.mika.chatroomreview.model;

import com.mika.chatroomreview.constant.Constant;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddFriendRequest {
    private String type = Constant.ADD_FRIEND_REQUIRE;
    private String addReason;
    private Integer friendId;

    // 用来处理接受/拒绝好友申请
    private Integer fromId;
    private String friendName;

    public AddFriendRequest(String type, Integer fromId, String friendName) {
        this.type = type;
        this.fromId = fromId;
        this.friendName = friendName;
    }
}
