package com.mika.principle;

import com.mika.principle.scope.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPrincipleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringPrincipleApplication.class, args);
//        Dog bean = context.getBean(Dog.class);
//        System.out.println(bean);
    }

}
