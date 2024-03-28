package com.mika.chatroomreview.component;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketSession;

import java.util.HashMap;
import java.util.Map;

// 记录 userId 与 WebSocketSession 的映射
@Slf4j
@Component
public class OnlineUserManager {
    private Map<Integer, WebSocketSession> sessions = new HashMap<>();

    // 用户上线方法
    public void online(Integer userId, WebSocketSession webSocketSession) {
        // 参数校验
        if (userId == null || userId < 1 || webSocketSession == null) return;
        // 先看看用户是否已经在线，如果已经在线，那就啥都不干(防止多开)
        WebSocketSession session1 = sessions.get(userId);
        if (session1 != null) return;

        sessions.put(userId, webSocketSession);
        log.info("用户" + userId + "上线");
    }

    // 用户下线方法
    public void offline(Integer userId, WebSocketSession session) {
        if (userId == null || userId < 1) {
            return;
        }
        WebSocketSession existSession = sessions.get(userId);
        if (session == existSession) {
            // 如果这俩 session 是同一个，才真正进行下线操作，否则啥都不干(从多开角度考虑)
            sessions.remove(userId);
            log.info("[" + userId + "] 用户下线！");
            return;
        }
    }

    // 根据 userId 获取 WebSocketSession
    public WebSocketSession getWebSocketSessionById(Integer userId) {
        if (userId == null || userId < 1) {
            return null;
        }
        return sessions.get(userId);
    }
}
