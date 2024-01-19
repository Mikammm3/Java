package com.example.demo.ioc.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/log2")
public class LoggerController2 {
    
    @RequestMapping("/logLevel")
    public String logLevel() {
        log.error("=====我是 error 级别的日志=====");
        log.warn("=====我是 warn 级别的日志=====");
        log.info("=====我是 info 级别的日志=====");
        log.debug("=====我是 debug 级别的日志=====");
        log.trace("=====我是 trace 级别的日志=====");
        return "success";
    }
}
