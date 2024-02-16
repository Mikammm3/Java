package com.mika.book.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class TimeRecordAspect {

    @Around("execution(* com.mika.book.controller.*.*(..))")
    public Object record(ProceedingJoinPoint pj) throws Throwable {
        /**
         * 切面逻辑
         * 1. 记录开始时间
         * 2. 执行目标方法
         * 3. 记录结束时间
         * 4. 打印消耗时间
         */
        long start = System.currentTimeMillis();
        Object result = pj.proceed();
        log.info(pj.getSignature() + "cost time: " + (System.currentTimeMillis() - start) + "ms");
        return result;
    }
}
