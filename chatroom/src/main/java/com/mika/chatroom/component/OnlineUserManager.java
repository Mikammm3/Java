package com.mika.chatroom.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketSession;

import java.util.concurrent.ConcurrentHashMap;


// 通过这个类来记录当前用户在线状态。（维护了 userId 和 WebSocketSession 之间的映射）
@Slf4j
@Component
public class OnlineUserManager {
    // 有可能会有多个多个客户端同时建立连接，就要考虑多线程的问题
    // HashMap 是线程不安全的，而 ConcurrentHashMap 是线程安全的，所以用它代替 HashMap
    private ConcurrentHashMap<Integer, WebSocketSession> sessions = new ConcurrentHashMap<>();

    // 1. 用户上线，给哈希表插入键值对
    public void online(Integer userId, WebSocketSession session) {
        if (userId == null || userId < 1) {
            return;
        }
        if (sessions.get(userId) != null) {
            // 禁止多开，此时说明用户已经上线了，就登录失败，
            // 不会记录这个上线关系，后续就收不到任何消息(毕竟我们是通过映射关系来实现消息转发的)
            log.info("[" + userId + "] 用户已经被登录了，登录失败！");
            return;
        }
        sessions.put(userId, session);
        log.info("[" + userId + "] 用户上线！");
    }


    // 2. 用户下线，针对哈希表删除键值对
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

    // 3. 通过 userId 去表中获取 WebSocketSession
    public WebSocketSession getWebSocketSessionById(Integer userId) {
        if (userId == null || userId < 1) {
            return null;
        }
        return sessions.get(userId);
    }
}
