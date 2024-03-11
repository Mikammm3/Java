package com.mika.principle.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class BeanConfig {

    @Bean
    public Dog dog() {
        Dog dog = new Dog("zhangsan");
        return dog;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Dog singleDog() {
        return new Dog();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Dog prototypeDog() {
        return new Dog();
    }

    @Bean
    @RequestScope
    public Dog requestDog() {
        return new Dog();
    }

    @Bean
    @SessionScope
    public Dog sessionDog() {
        return new Dog();
    }

    @Bean
    @ApplicationScope
    public Dog applicationDog() {
        return new Dog();
    }
}
