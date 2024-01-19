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
}
