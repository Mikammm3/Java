package com.mika.book.controller;


import com.mika.book.model.UserInfo;
import com.mika.book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public boolean login(String username, String password, HttpSession session) {
        // 校验参数
        if (!StringUtils.hasLength(username) || !StringUtils.hasLength(password)) {
            return false;
        }
        // 判断数据库的密码和用户输入的密码是否一致
        // 查询数据库，得到数据库的密码
        UserInfo userInfo = userService.queryByName(username);
        if (userInfo == null) return false;
        // 校验账户密码是否正确
        if (userInfo.getPassword().equals(password)) {
            userInfo.setPassword("");
            // 存 session
            session.setAttribute("user_session", userInfo);
            return true;
        }
        return false;
    }
}
