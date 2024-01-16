package com.example.demo.ioc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prop")
public class PropertiesController {

    @Value("${bite.key1}")
    private String key1;

    @Value("${bite.key2}")
    private Integer key2;

    @RequestMapping("/readValue")
    public String readValue() {
        return "从 Properties 读取配置文件，key1: " + key1 + ", key2: " + key2;
    }
}
