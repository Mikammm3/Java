package com.mika.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
//@Component
@Order(2)
public class AspectDemo4 {
    @Before("com.mika.aop.aspect.AspectDemo.pt()")
    public void doBefore() {
        log.info("执行 AspectDemo4.before 方法...");
    }

    @After("com.mika.aop.aspect.AspectDemo.pt()")
    public void doAfter() {
        log.info("执行 AspectDemo4.after 方法...");
    }

}
