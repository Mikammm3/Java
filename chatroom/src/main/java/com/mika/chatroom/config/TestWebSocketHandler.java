package com.mika.chatroom.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Slf4j
@Component
public class TestWebSocketHandler extends TextWebSocketHandler {
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        // 这个方法会在 websocket 建立连接成功后，被自动调用
        log.info("TestWebSocketConfig 连接成功！");
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        // 这个方法是在 websocket 收到消息的时候，自动调用
        log.info("TestWebSocketConfig 收到消息！" + message.toString());
        // session 是个会话，里面记录了通信双方是谁。(session 中就持有了 websocket 的通信连接)
        session.sendMessage(message);
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        // 这个方法是在连接出现异常时，自动调用
        log.error("TestWebSocketConfig 连接异常！");
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        // 这个方法是在连接正常关闭后，自动调用
        log.info("TestWebSocketConfig 连接关闭！");
    }
}
