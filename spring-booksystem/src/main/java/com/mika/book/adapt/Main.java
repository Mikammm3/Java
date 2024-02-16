package com.mika.book.adapt;

public class Main {
    public static void main(String[] args) {
        Slf4jApi slf4jApi = new Slf4jLog4jAdapt(new Log4j());
        slf4jApi.log("打印日志");
        Slf4jApi slf4jApi2 = new Slf4jLogBackAdapt(new LogBack());
        slf4jApi2.log("打印日志");
    }
}
