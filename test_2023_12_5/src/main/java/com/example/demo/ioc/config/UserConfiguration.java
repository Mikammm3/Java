package com.example.demo.ioc.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {
    public void sayHi() {
        System.out.println("hello, UserConfiguration...");
    }
}
