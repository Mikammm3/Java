package com.mika.blog.config;

import com.mika.blog.utils.JwtUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户登录拦截器
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 1. 从 header 中获取 token
        // 2. 校验 token
        // 3. 成功放行
        String userToken = request.getHeader("user_token_header");
        Boolean result = JwtUtils.parseToken(userToken);
        if (result) {
            return true;
        }
        response.setStatus(401);
        return false;
    }
}
