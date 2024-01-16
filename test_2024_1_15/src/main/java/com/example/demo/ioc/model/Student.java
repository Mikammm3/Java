package com.example.demo.ioc.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "student")
@Component
public class Student {
    private String name;
    private Integer age;
    private Integer id;
}
