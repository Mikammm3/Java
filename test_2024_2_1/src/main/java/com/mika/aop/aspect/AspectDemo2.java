package com.mika.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
//@Component
@Order(4)
public class AspectDemo2 {
    @Before("com.mika.aop.aspect.AspectDemo.pt()")
    public void doBefore() {
        log.info("执行 AspectDemo2.before 方法...");
    }

    @After("com.mika.aop.aspect.AspectDemo.pt()")
    public void doAfter() {
        log.info("执行 AspectDemo2.after 方法...");
    }

}
