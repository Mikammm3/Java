package com.mika.blog.config;

import com.mika.blog.model.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler
    public Result handle(Exception e) {
        return Result.fail(e.getMessage());
    }
}
