package com.mika.principle.beanlife;

import com.mika.principle.scope.Dog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Component
public class BeanLifeComponent {

    private Dog dog;

    public BeanLifeComponent() {
        log.info("执行构造方法...");
    }

    @Autowired
    public void setDog(Dog dog) {
        this.dog = dog;
        log.info("执行 setter 方法...");
    }

    @PostConstruct
    public void init() {
        log.info("执行 init 方法...");
    }

    public void use() {
        log.info("执行 use 方法...");
    }

    @PreDestroy
    public void destroy() {
        log.info("执行 destroy 方法...");
    }
}
