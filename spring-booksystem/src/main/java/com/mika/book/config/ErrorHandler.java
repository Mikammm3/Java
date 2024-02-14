package com.mika.book.config;

import com.mika.book.model.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ResponseBody
@ControllerAdvice
public class ErrorHandler {
    /**
     * 捕获异常，返回统一的结果
     */
    @ExceptionHandler
    public Result handle(Exception e) {
        log.error("捕获异常, e:", e);
        return Result.fail("内部发生错误e: " + e);
    }

    @ExceptionHandler
    public Result handle(NullPointerException e) {
        log.error("捕获异常, e:", e);
        return Result.fail("内部发生NullPointerException错误e: " + e);
    }

    @ExceptionHandler
    public Result handle(ArithmeticException e) {
        log.error("捕获异常, e:", e);
        return Result.fail("内部发生ArithmeticException错误e: " + e);
    }
}
