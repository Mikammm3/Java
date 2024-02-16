package com.mika.book.adapt;


public class Slf4jLogBackAdapt implements Slf4jApi {
    private LogBack logBack;

    public Slf4jLogBackAdapt(LogBack logBack) {
        this.logBack = logBack;
    }

    public Slf4jLogBackAdapt() {
    }

    @Override
    public void log(String message) {
        logBack.info("Slf4jLogBackAdapt 打印日志: " + message);
    }
}
