package com.mika.chatroomreview.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mika.chatroomreview.component.OnlineUserManager;
import com.mika.chatroomreview.constant.Constant;
import com.mika.chatroomreview.model.*;
import com.mika.chatroomreview.service.MessageService;
import com.mika.chatroomreview.service.MessageSessionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Slf4j
@Component
public class WebSocketHandler extends TextWebSocketHandler {

    @Autowired
    private OnlineUserManager onlineUserManager;

    @Autowired
    private MessageSessionService messageSessionService;

    @Autowired
    private MessageService messageService;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        // WebSocketSession 是在 WebSocket 连接中对应的会话
        // 这个方法会在 WebSocket 成功建立连接之后，自动调用
        // 判断用户是否登录
        Map<String, Object> attributes = session.getAttributes();
        User user = (User) attributes.get(Constant.USER_SESSION);
        if (user == null) return;
        // 用户上线，存映射
        onlineUserManager.online(user.getUserId(), session);

    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        log.info("WebSocketHandler 收到消息！" + message.toString());
        // 判断用户是否登录
        Map<String, Object> attributes = session.getAttributes();
        User user = (User) attributes.get(Constant.USER_SESSION);
        if (user == null) return;

        // TextMessage 就是 收到的消息的值
        // 这个方法会在 WebSocket 接收到消息时，自动调用
        String payload = message.getPayload();
        // 将获取的 payload 转化成 Java 对象
        MessageRequest messageRequest = objectMapper.readValue(payload, MessageRequest.class);
        if (Constant.MESSAGE.equals(messageRequest.getType())) {
            // 处理消息的转发以及保存
            transferMessage(user, messageRequest);
        } else if (Constant.ADD_FRIEND_REQUIRE.equals(messageRequest.getType())) {
            AddFriendRequest req = objectMapper.readValue(message.getPayload(), AddFriendRequest.class);
            // 处理好友申请的发送以及保存
            sendAddFriendRequire(user, req);
        } else if (Constant.ACCEPT_ADD_FRIEND_REQUIRE.equals(messageRequest.getType())) {
            AddFriendRequest req = objectMapper.readValue(message.getPayload(), AddFriendRequest.class);
            req.setType(Constant.ACCEPT_ADD_FRIEND_REQUIRE);
            // 处理接受好友申请
            acceptAddFriendRequire(user, req);
        } else if (Constant.REJECT_ADD_FRIEND_REQUIRE.equals(messageRequest.getType())) {
            AddFriendRequest req = objectMapper.readValue(message.getPayload(), AddFriendRequest.class);
            req.setType(Constant.REJECT_ADD_FRIEND_REQUIRE);
            // 处理拒绝好友申请
            rejectAddFriendRequire(user, req);
        } else {
            log.error("[WebSocketHandler] type 类型错误！" + messageRequest.getType());
        }
    }

    private void acceptAddFriendRequire(User user, AddFriendRequest req) throws IOException {
        if (user == null || req == null) return;
        // 1. 先构造一个响应
        AddFriendResponse resp = new AddFriendResponse(req.getType(), req.getFromId(), user.getUserName());
        // 2. 根据 fromId 获取 session
        WebSocketSession session = onlineUserManager.getWebSocketSessionById(resp.getFromId());
        if (session == null) {
            // 用户不在线
            return;
        }
        // 3. 发送 respJson
        String respJson = objectMapper.writeValueAsString(resp);
        session.sendMessage(new TextMessage(respJson));
    }

    private void rejectAddFriendRequire(User user, AddFriendRequest req) throws IOException {
        if (user == null || req == null) return;
        // 1. 先构造一个响应
        AddFriendResponse resp = new AddFriendResponse(req.getType(), req.getFromId(), user.getUserName());
        // 2. 根据 fromId 获取 session
        WebSocketSession session = onlineUserManager.getWebSocketSessionById(resp.getFromId());
        if (session == null) {
            // 用户不在线
            return;
        }
        // 3. 发送 respJson
        String respJson = objectMapper.writeValueAsString(resp);
        session.sendMessage(new TextMessage(respJson));
    }

    private void sendAddFriendRequire(User user, AddFriendRequest req) throws IOException {
        if (user == null || req == null) return;
        // 1. 先构造一个响应
        AddFriendResponse resp = new AddFriendResponse(req.getAddReason(), req.getFriendId(), user.getUserName(), user.getUserId());
        // 2. 根据 friendId 获取 session
        WebSocketSession session = onlineUserManager.getWebSocketSessionById(req.getFriendId());
        if (session == null) {
            // 用户不在线，则不发送
            return;
        }
        // 3. 将响应转化成 json 格式，然后发送
        String respJson = objectMapper.writeValueAsString(resp);
        session.sendMessage(new TextMessage(respJson));

    }

    private void transferMessage(User user, MessageRequest messageRequest) throws IOException {
        // 1. 先构造一个 MessageResponse 对象
        MessageResponse messageResponse = new MessageResponse(user.getUserId(), user.getUserName(), messageRequest.getSessionId(), messageRequest.getContent());
        String respJson = objectMapper.writeValueAsString(messageResponse);
        // 2. 根据 sessionId，获取好友列表
        List<Friend> friends = messageSessionService.getFriendsBySessionId(messageResponse.getSessionId(), user.getUserId());
        // 同时给自己也要发一份消息，方便前端展示
        friends.add(new Friend(user.getUserName(), user.getUserId()));
        // 3. 根据 userId 获取 WebSocketSession 对象，进行消息转发
        for (Friend friend : friends) {
            WebSocketSession session = onlineUserManager.getWebSocketSessionById(friend.getFriendId());
            if (session == null) {
                // 用户不在线
                continue;
            }
            session.sendMessage(new TextMessage(respJson));
        }
        // 4. 保存消息记录
        Integer result = messageService.addMessage(new Message(user.getUserId(), user.getUserName(), messageResponse.getSessionId(), messageResponse.getContent()));
        if (result == null || result < 1) {
            log.error("增加消息到数据库失败");
        }
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        // 这个方法会在 WebSocket 连接异常之后，自动调用
        // 判断用户是否登录
        Map<String, Object> attributes = session.getAttributes();
        User user = (User) attributes.get(Constant.USER_SESSION);
        if (user == null) return;
        // 用户下线，删除映射
        onlineUserManager.offline(user.getUserId(), session);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        // 这个方法会在 WebSocket 连接正常关闭后，自动调用
        // 判断用户是否登录
        Map<String, Object> attributes = session.getAttributes();
        User user = (User) attributes.get(Constant.USER_SESSION);
        if (user == null) return;
        // 用户下线，删除映射
        onlineUserManager.offline(user.getUserId(), session);
    }
}
