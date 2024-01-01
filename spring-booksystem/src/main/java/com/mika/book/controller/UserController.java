package com.mika.book.controller;


import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public boolean login(String username, String password, HttpSession session) {
        // 校验参数
        if (!StringUtils.hasLength(username) || !StringUtils.hasLength(password)) {
            return false;
        }
        // 校验账户密码是否正确
        if ("zhangsan".equals(username) && "123".equals(password)) {
            // 存 session
            session.setAttribute("username", username);
            return true;
        }
        return false;
    }
}
