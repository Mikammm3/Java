package com.mika.chatroom.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

@Configuration
@EnableWebSocket // 用来启动 WebSocket 的
public class WebSocketConfig implements WebSocketConfigurer {

//    @Autowired
//    private TextWebSocketHandler textWebSocketHandler;

    @Autowired
    private WebSocketHandler webSocketHandler;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        // 通过这个方法，把创建好的 Handler 类给注册到具体的路径上
        // 此时当浏览器，websocket 的请求路径是 "/test" ,就会调用到 TextWebSocketHandler 里的方法
        // registry.addHandler(textWebSocketHandler, "/test");
        registry.addHandler(webSocketHandler, "/WebSocketMessage")
                // 通过注册这个特定的 HttpSession 拦截器，就可以把用户给 Httpsession 中添加的 Attribute 键值对
                // 往我们的 WebSocketSession 里也添加一份
                .addInterceptors(new HttpSessionHandshakeInterceptor());
    }
}
