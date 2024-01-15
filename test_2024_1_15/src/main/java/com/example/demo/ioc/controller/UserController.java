package com.example.demo.ioc.controller;

import com.example.demo.ioc.config.UserConfiguration;
import com.example.demo.ioc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    // 把 UserService 注入进来
    //属性注入
//    @Autowired
//    private UserService userService;


    // 构造方法注入
//    private UserService userService;
//    private UserConfiguration userConfiguration;
//
//    public UserController() {
//    }
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @Autowired
//    public UserController(UserService userService, UserConfiguration userConfiguration) {
//        this.userService = userService;
//        this.userConfiguration = userConfiguration;
//    }

    // 使用 set 方法注入
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void sayHi() {
        System.out.println("hello,UserController...");
        userService.sayHi();
    }
}
