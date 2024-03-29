package com.mika.chatroomreview.constant;

public class Constant {
    public static final String USER_SESSION = "user_session";
    // 这个是 websocket 用来处理 实时发送消息 的请求
    public static final String MESSAGE = "message";
    // 这个是 websocket 用来处理 实时发送好友申请 的请求
    public static final String ADD_FRIEND_REQUIRE = "addFriendRequire";
    // 这个是 websocket 用来处理 实时接受好友申请 的请求
    public static final String ACCEPT_ADD_FRIEND_REQUIRE = "acceptAddFriendRequire";
    // 这个是 websocket 用来处理 实时拒绝好友申请 的请求
    public static final String REJECT_ADD_FRIEND_REQUIRE = "rejectAddFriendRequire";
}
