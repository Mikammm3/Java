package com.mika.book.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mika.book.model.Result;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@ControllerAdvice
public class ResponseAdvice implements ResponseBodyAdvice {
    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        // 对哪些请求进行处理 true-进行处理，false-不进行处理
        return true;
    }

    @SneakyThrows
    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        // 如果 body 是 Result 类型，就不用再打包了
        if (body instanceof Result) return body;
        if (body instanceof String) {
            return objectMapper.writeValueAsString(Result.success(body));
        }
        return Result.success(body);
    }
}
