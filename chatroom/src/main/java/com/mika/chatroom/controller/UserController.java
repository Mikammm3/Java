package com.mika.chatroom.controller;

import com.mika.chatroom.constant.Constant;
import com.mika.chatroom.model.User;
import com.mika.chatroom.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public User register(String userName, String password) {
        if (!StringUtils.hasLength(userName) || !StringUtils.hasLength(password)) {
            return null;
        }
        User user = null;
        try {
            user = new User(userName, password);
            Integer result = userService.insert(user);
            log.info("register, result: " + result);
            user.setPassword("");
            if (result > 0) return user;
        } catch (Exception e) {
            log.error("e:{}", e);
            return null;
        }
        return null;
    }

    @RequestMapping("/login")
    public User login(String userName, String password, HttpServletRequest request) {
        if (!StringUtils.hasLength(userName) || !StringUtils.hasLength(password)) {
            return null;
        }
        User user = userService.selectByName(userName);
        if (user != null && password.equals(user.getPassword())) {
            user.setPassword("");
            request.getSession(true).setAttribute(Constant.USER_SESSION, user);
            return user;
        }
        log.error("登录失败！用户名或密码错误! use{} ", user);
        return null;
    }
}
