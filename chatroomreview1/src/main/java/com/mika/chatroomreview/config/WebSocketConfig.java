package com.mika.chatroomreview.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

@Configuration
@EnableWebSocket // 用来启动 WebSocket 的
public class WebSocketConfig implements WebSocketConfigurer {
    @Autowired
    private WebSocketHandler webSocketHandler;

    // 配置 WebSocketHandler 的路由, 注册到具体的路径上
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        // 当浏览器 WebSocket 的请求路径是 /WebSocketMessage 时，就会调用 WebSocketHandler 里面的方法
        registry.addHandler(webSocketHandler, "/WebSocketMessage")
                // 通过注册这个特定的 HttpSession 拦截器，就可以把用户给 Httpsession 中添加的 Attribute 键值对
                // 往我们的 WebSocketSession 里也添加一份
                .addInterceptors(new HttpSessionHandshakeInterceptor());
    }
}
