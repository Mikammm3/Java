package com.mika.chatroom.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mika.chatroom.component.OnlineUserManager;
import com.mika.chatroom.constant.Constant;
import com.mika.chatroom.model.*;
import com.mika.chatroom.service.MessageService;
import com.mika.chatroom.service.MessageSessionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.List;


@Slf4j
@Component
public class WebSocketHandler extends TextWebSocketHandler {

    @Autowired
    private OnlineUserManager onlineUserManager;


    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private MessageSessionService messageSessionService;

    @Autowired
    private MessageService messageService;


    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        log.info("WebSocketHandler 连接成功！");
        User user = (User) session.getAttributes().get(Constant.USER_SESSION);
        if (user == null) return;
        log.info("获取到 userId: " + user.getUserId());
        // 把键值对存起来
        onlineUserManager.online(user.getUserId(), session);
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        log.info("WebSocketHandler 收到消息！" + message.toString());
        // 处理消息的接收，转发，以及消息的保存记录
        // 1. 获取当前用户的信息，后续要进行消息转发啥的
        User user = (User) session.getAttributes().get(Constant.USER_SESSION);
        if (user == null) {
            log.error("user == null  用户未登录，无法进行消息的转发");
            return;
        }
        // 2. 针对请求进行解析, 把 json 格式的字符串, 转成 Java 中的对象
        MessageRequest request = objectMapper.readValue(message.getPayload(), MessageRequest.class);
        if (request.getType().equals("message")) {
            // 进行消息转发
            transferMessage(user, request);
        } else if (request.getType().equals("addFriendRequire")) {
            // 处理显示好友申请
            AddFriendRequest req = objectMapper.readValue(message.getPayload(), AddFriendRequest.class);
            req.setFromId(user.getUserId());
            sendAddFriendRequire(user, req);

        } else if (request.getType().equals("acceptAddFriendRequire")) {
            // 处理接受好友申请
            AddFriendRequest req = objectMapper.readValue(message.getPayload(), AddFriendRequest.class);
            req.setType("acceptAddFriendRequire");
            acceptAddFriendRequire(req);
        } else if (request.getType().equals("rejectAddFriendRequire")) {
            // 处理拒绝好友申请
            AddFriendRequest req = objectMapper.readValue(message.getPayload(), AddFriendRequest.class);
            req.setType("rejectAddFriendRequire");
            rejectAddFriendRequire(req);
        } else {
            log.error("消息类型有误! " + message.getPayload());
        }

    }

    // 这里实现实时提示接受好友请求
    private void acceptAddFriendRequire(AddFriendRequest req) throws IOException {
        log.info("[acceptAddFriendRequire]  req: " + req);
        // 1. 先构建一个待转发的响应对象，AddFriendResponse
        AddFriendResponse response = new AddFriendResponse(req.getFromId(), req.getFriendName());
        response.setType("acceptAddFriendRequire");
        // 把这个 Java 对象转成 json 格式字符串
        String respJson = objectMapper.writeValueAsString(response);
        // 3. 给用户都发一份响应消息
        WebSocketSession webSocketSession = onlineUserManager.getWebSocketSessionById(response.getFromId());
        if (webSocketSession == null) {
            // 如果用户不在线，则不发送
            return;
        }
        log.info("[acceptAddFriendRequire] respJson: " + respJson);
        webSocketSession.sendMessage(new TextMessage(respJson));
    }

    // 这里实现实时提示拒绝好友请求
    private void rejectAddFriendRequire(AddFriendRequest req) throws IOException {
        log.info("[rejectAddFriendRequire]  req: " + req);
        // 1. 先构建一个待转发的响应对象，AddFriendResponse
        AddFriendResponse response = new AddFriendResponse(req.getFromId(), req.getFriendName());
        response.setType("rejectAddFriendRequire");
        // 把这个 Java 对象转成 json 格式字符串
        String respJson = objectMapper.writeValueAsString(response);
        // 3. 给用户都发一份响应消息
        WebSocketSession webSocketSession = onlineUserManager.getWebSocketSessionById(response.getFromId());
        if (webSocketSession == null) {
            // 如果用户不在线，则不发送
            return;
        }
        log.info("[acceptAddFriendRequire] respJson: " + respJson);
        webSocketSession.sendMessage(new TextMessage(respJson));
    }


    // 这里实现实时发送好友请求
    private void sendAddFriendRequire(User fromUser, AddFriendRequest req) throws IOException {
        log.info("[sendAddFriendRequire] fromUser: " + fromUser.toString() + ", req: " + req);
        // 1. 先构建一个待转发的响应对象，AddFriendResponse
        AddFriendResponse response = new AddFriendResponse(req.getAddReason(), req.getFriendId(), fromUser.getUserId(), fromUser.getUserName());
        // 把这个 Java 对象转成 json 格式字符串
        String respJson = objectMapper.writeValueAsString(response);
        // 3. 给用户都发一份响应消息
        WebSocketSession webSocketSession = onlineUserManager.getWebSocketSessionById(response.getFriendId());
        if (webSocketSession == null) {
            // 如果用户不在线，则不发送
            return;
        }
        log.info("[sendAddFriendRequire] respJson: " + respJson);
        webSocketSession.sendMessage(new TextMessage(respJson));
    }


    // 通过这个方法来完成消息实际的转发工作
    // fromUser 消息发送者
    private void transferMessage(User fromUser, MessageRequest request) throws IOException {
        // 1. 先构建一个待转发的响应对象，MessageResponse
        MessageResponse response = new MessageResponse(fromUser.getUserId(), fromUser.getUserName(), request.getSessionId(), request.getContent());
        // 把这个 Java 对象转成 json 格式字符串
        String respJson = objectMapper.writeValueAsString(response);
        log.info("[transferMessage] respJson: " + respJson);

        // 2. 根据请求中的 sessionId，获取到 MessageSession 里都有哪些用户，通过查询数据库就知道了
        List<Friend> friends = messageSessionService.getFriendBySessionId(response.getSessionId(), fromUser.getUserId());
        // 此处注意!!! 数据库查询会把自己排除在外，所以要手动添加 fromUser 进 friends 里
        friends.add(new Friend(fromUser.getUserId(), fromUser.getUserName()));

        // 3. 循环遍历上面的列表，给列表中的每个用户都发一份响应消息
        //    知道了每个用户 userId，通过 OnlineUserManager 查询 websocketSession，进行发送
        //    注意: 除了给好友发一份，也要给自己发一份，方便实现在自己的客户端上显示自己发的消息
        //    注意: 一个会话中，可能有多个用户(群聊)，前端不支持群聊，但是后端是支持群聊的
        for (Friend friend : friends) {
            WebSocketSession webSocketSession = onlineUserManager.getWebSocketSessionById(friend.getFriendId());
            if (webSocketSession == null) {
                // 如果用户不在线，则不发送
                continue;
            }
            webSocketSession.sendMessage(new TextMessage(respJson));
        }

        // 4. 转发的消息需要记录到数据库中，方便我们获取历史消息
        Integer result = messageService.insertMessage(new Message(fromUser.getUserId(), fromUser.getUserName(), response.getSessionId(), response.getContent()));
        if (result == null || result < 1) {
            log.error("增加消息到数据库失败");
        }
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        log.info("WebSocketHandler 连接异常！" + exception.toString());

        User user = (User) session.getAttributes().get(Constant.USER_SESSION);
        if (user == null) return;
        onlineUserManager.offline(user.getUserId(), session);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        log.info("WebSocketHandler 连接关闭！" + status.toString());

        User user = (User) session.getAttributes().get(Constant.USER_SESSION);
        if (user == null) return;
        onlineUserManager.offline(user.getUserId(), session);
    }
}
