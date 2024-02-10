package com.example.demo.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/check")
    public boolean check(@RequestParam(value = "userName", required = false) String username, String password, HttpSession session) {
        // 校验账号密码是否为空
//        if (username == null || "".equals(username) || password == null || "".equals(password)) {
//            return false;
//        }
        if (!StringUtils.hasLength(username) || !StringUtils.hasLength(password)) {
            return false;
        }
        // 校验账号密码是否正确
        // 数据模拟
        if ("zhangsan".equals(username) && "123".equals(password)) {
            session.setAttribute("username", username);
            return true;
        }
        return false;

    }

    @RequestMapping("/index")
    public String index(HttpSession session) {
        String username = (String) session.getAttribute("username");
        return username;
    }
}
