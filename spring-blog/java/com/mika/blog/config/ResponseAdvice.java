package com.mika.blog.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mika.blog.model.Result;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
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
        // 哪个接口执行统一结果返回
        return true;
    }

    @SneakyThrows
    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        // 统一结果返回的具体逻辑
        if (body instanceof Result) return body;
        // 对 String 类型单独处理
        if (body instanceof String) {
            return objectMapper.writeValueAsString(Result.success(body));
        }
        return Result.success(body);
    }
}
