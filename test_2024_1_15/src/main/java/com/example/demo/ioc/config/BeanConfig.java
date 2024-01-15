package com.example.demo.ioc.config;

import com.example.demo.ioc.model.UserInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfig {

    @Bean({"u1", "u2"})
    public UserInfo userInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(18);
        userInfo.setId(1);
        userInfo.setName("zhangsan");
        return userInfo;
    }

    @Bean
    // @Primary
    public UserInfo userInfo2() {
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(18);
        userInfo.setId(5);
        userInfo.setName("lisi");
        return userInfo;
    }
}
