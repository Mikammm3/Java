package com.mika.aop.controller;

import com.mika.aop.aspect.TimeRecord;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/test")
@RestController
public class TestController {

    @TimeRecord
    @RequestMapping("/t1")
    public String t1() {
        log.info("执行 t1 方法");
        return "t1";
    }

    @RequestMapping("/t2")
    public String t2() {
        log.info("执行 t2 方法");
        return "t2";
    }
}
