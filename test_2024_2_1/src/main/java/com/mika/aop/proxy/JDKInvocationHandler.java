package com.mika.aop.proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@Slf4j
public class JDKInvocationHandler implements InvocationHandler {
    private Object target;

    public JDKInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 调用目标方法，并对方法进行增强
     *
     * @param proxy  代理类
     * @param method 目标方法
     * @param args   参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("JDK 动态代理开始");
        // 调用目标方法
        Object result = method.invoke(target, args);
        log.info("JDK 动态代理结束");
        return result;
    }
}
