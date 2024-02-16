package com.mika.aop.controller;

import com.mika.aop.aspect.TimeRecord;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/u1")
    public String u1() {
        log.info("执行 u1 方法");
        return "u1";
    }

    @TimeRecord
    @RequestMapping("/u2")
    public String u2() {
        log.info("执行 u2 方法");
        return "u2";
    }

}
