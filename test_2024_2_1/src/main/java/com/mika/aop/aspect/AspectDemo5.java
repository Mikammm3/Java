package com.mika.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class AspectDemo5 {
    @Around("@annotation(com.mika.aop.aspect.TimeRecord)")
    public Object timeRecord(ProceedingJoinPoint pj) {
        long start = System.currentTimeMillis();
        Object result = null;
        try {
            result = pj.proceed();
        } catch (Throwable e) {
            log.error(pj.toShortString() + "发生异常, e: ", e);
        }
        log.info(pj.toShortString() + "执行时间: " + (System.currentTimeMillis() - start) + "ms");
        return result;
    }
}
