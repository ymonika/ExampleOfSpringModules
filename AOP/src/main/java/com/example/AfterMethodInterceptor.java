package com.example;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterMethodInterceptor implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method,
                               Object[] args, Object target) throws Throwable {
        System.out.println("AfterMethodInterceptor : After method hijacked!");
    }
}