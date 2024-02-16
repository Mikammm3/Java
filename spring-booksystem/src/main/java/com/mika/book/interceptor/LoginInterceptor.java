package com.mika.book.interceptor;

import com.mika.book.constants.Constants;
import com.mika.book.model.Result;
import com.mika.book.model.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Slf4j
@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 目标方法执行前执行
        log.info("目标方法执行前执行: LoginInterceptor.preHandle....");
        // true- 放行，false-拦截
        // 验证用户是否登录
        HttpSession session = request.getSession();
        UserInfo userInfo = (UserInfo) session.getAttribute(Constants.USER_SESSION_KEY);
        if (userInfo == null || userInfo.getId() < 1) {
            response.setStatus(401);// 401-没权限
            return false;
        }
        return true;
    }
}
