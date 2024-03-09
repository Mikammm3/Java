package com.mika.blog.config;

import com.mika.blog.model.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ResponseBody
@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler
    public Result handle(Exception e) {
        log.error("发生异常， e:{}", e);
        return Result.fail(e.getMessage());
    }
}
