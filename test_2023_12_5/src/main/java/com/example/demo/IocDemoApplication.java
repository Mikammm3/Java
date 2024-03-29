package com.example.demo;

import com.example.demo.ioc.config.UserConfiguration;
import com.example.demo.ioc.conponent.UserComponent;
import com.example.demo.ioc.controller.UserController;
import com.example.demo.ioc.model.UserInfo;
import com.example.demo.ioc.repo.UserRepository;
import com.example.demo.ioc.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IocDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(IocDemoApplication.class, args);
        UserController bean = context.getBean(UserController.class);
        bean.sayHi();

        UserService userService = (UserService) context.getBean("userService");
        userService.sayHi();

        UserComponent userComponent = context.getBean("userComponent", UserComponent.class);
        userComponent.sayHi();

        UserRepository userRepository = (UserRepository) context.getBean("userRepository");
        userRepository.sayHi();

        UserConfiguration userConfiguration = (UserConfiguration) context.getBean("userConfiguration");
        userConfiguration.sayHi();

        UserInfo u1 = context.getBean("u1", UserInfo.class);
        System.out.println(u1);

        UserInfo u2 = context.getBean("u2", UserInfo.class);
        System.out.println(u2);
    }

}
