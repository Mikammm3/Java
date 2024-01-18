package com.example.demo.ioc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LoggerController {

    private static final Logger logger = LoggerFactory.getLogger(LoggerController.class);

    @RequestMapping("/printLog")
    public String printLog() {
        System.out.println("打印日志");
        logger.info("=====我是日志对象打印的日志=====");
        return "success";
    }


    @RequestMapping("/logLevel")
    public String logLevel() {

        logger.error("=====我是 error 级别的日志=====");
        logger.warn("=====我是 warn 级别的日志=====");
        logger.info("=====我是 info 级别的日志=====");
        logger.debug("=====我是 debug 级别的日志=====");
        logger.trace("=====我是 trace 级别的日志=====");
        return "success";
    }
}
