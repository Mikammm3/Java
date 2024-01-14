package com.example.demo.ioc.controller;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    public void sayHi() {
        System.out.println("hello,UserController...");
    }
}
