package com.mika.chatroomreview.controller;

import com.mika.chatroomreview.constant.Constant;
import com.mika.chatroomreview.model.User;
import com.mika.chatroomreview.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public User login(String userName, String password, HttpServletRequest request) {
        if (!StringUtils.hasLength(userName) || !StringUtils.hasLength(password)) {
            log.error("[login] 用户名或密码为空");
            return null;
        }
        // 用户登录成功，就存 session
        User user = userService.selectUserByName(userName);
        if (user == null || user.getUserId() < 1) {
            log.error("用户不存在");
            return null;
        }
        if (password.equals(user.getPassword())) {
            user.setPassword("");
            request.getSession(true).setAttribute(Constant.USER_SESSION, user);
            return user;
        }
        return null;
    }

    @RequestMapping("/register")
    public User register(String userName, String password) {
        if (!StringUtils.hasLength(userName) || !StringUtils.hasLength(password)) {
            log.error("[registry] 用户名或密码为空");
            return null;
        }
        User user = null;
        try {
            user = new User(userName, password);
            Integer result = userService.insertUser(user);
            log.info("register, result: " + result);
            user.setPassword("");
            if (result > 0) return user;
        } catch (Exception e) {
            log.error("e:{}", e);
            return null;
        }
        return null;
    }

    @RequestMapping("/getUserInfo")
    public User getUserInfo(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null) {
            return null;
        }
        User user = (User) session.getAttribute(Constant.USER_SESSION);
        if (user == null) return null;
        user.setPassword("");
        return user;
    }

    @RequestMapping("/getUsersByName")
    public List<User> getUsersByName(String userName) {
        if (!StringUtils.hasLength(userName)) {
            return null;
        }
        List<User> users = userService.getUsersByName(userName);
        if (users == null || users.size() == 0) return null;
        return users;
    }
}
