package com.mika.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
//@Component
public class AspectDemo {
    @Pointcut("execution(* com.mika.aop.controller.*.*(..))")
    public void pt() {
    }

    ;

    @Before("pt()")
    public void doBefore() {
        log.info("执行 AspectDemo.before 方法...");
    }

    @After("execution(* com.mika.aop.controller.*.*(..))")
    public void doAfter() {
        log.info("执行 AspectDemo.after 方法...");
    }

    @AfterReturning("execution(* com.mika.aop.controller.*.*(..))")
    public void doAfterReturning() {
        log.info("执行 AspectDemo.doAfterReturning 方法...");
    }

    @AfterThrowing("execution(* com.mika.aop.controller.*.*(..))")
    public void doAfterThrowing() {
        log.info("执行 AspectDemo.doAfterThrowing 方法...");
    }

    @Around("execution(* com.mika.aop.controller.*.*(..))")
    public Object doAround(ProceedingJoinPoint pj) {
        log.info("执行 AspectDemo.doAround 目标方法前...");
        Object o = null;
        try {
            o = pj.proceed();
        } catch (Throwable e) {
            log.error(pj.toShortString() + "发生异常, e: " + e);
        }
        log.info("执行 AspectDemo.doAround 目标方法后...");
        return o;
    }

}
