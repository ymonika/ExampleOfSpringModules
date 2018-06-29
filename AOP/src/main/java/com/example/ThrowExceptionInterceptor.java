package com.example;

import org.springframework.aop.ThrowsAdvice;

public class ThrowExceptionInterceptor implements ThrowsAdvice {

    public void afterThrowing(Exception e) throws Throwable {
        System.out.println(this.getClass() + " Throw exception: " + e.getMessage());
    }
}
