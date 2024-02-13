package com.mika.book.adapt;


public class Slf4jLog4jAdapt implements Slf4jApi {
    private Log4j log4j;

    public Slf4jLog4jAdapt(Log4j log4j) {
        this.log4j = log4j;
    }

    public Slf4jLog4jAdapt() {
    }

    @Override
    public void log(String message) {
        log4j.log("Slf4j 适配 Log4j, 日志打印: " + message);
    }
}
