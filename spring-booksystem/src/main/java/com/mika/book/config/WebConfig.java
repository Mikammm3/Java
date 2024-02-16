package com.mika.book.config;

import com.mika.book.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // /** 表示对所有的路径都生效
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**")
                // 排除一些路径
                .excludePathPatterns("/user/login")
                .excludePathPatterns("/**/login.html")
                .excludePathPatterns("/css/**")
                .excludePathPatterns("/js/**")
                .excludePathPatterns("/pic/**");
    }
}
