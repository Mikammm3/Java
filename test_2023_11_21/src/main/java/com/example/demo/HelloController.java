package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello,SpringBoot";
    }

    @RequestMapping("/helloCN")
    public String helloCN() {
        return "你好，SpringBoot";
    }
}
