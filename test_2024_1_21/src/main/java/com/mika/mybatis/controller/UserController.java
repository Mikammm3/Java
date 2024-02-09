package com.mika.mybatis.controller;

import com.mika.mybatis.model.UserInfo;
import com.mika.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/queryAllUser")
    public List<UserInfo> queryAllUser() {
        return userService.queryAllUser();
    }

    // 模拟 SQL 注入，完成用户登录
    @RequestMapping("/login")
    public UserInfo login(String userName, String password) {
        // 1. 根据用户名和密码查询
        return userService.queryUserByNameAndPs(userName, password);
    }
}
