package com.example.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;

public class AroundMethodInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("Method Name: " + invocation.getMethod().getName());
        System.out.println("Method Arguments: " + Arrays.asList(invocation.getArguments()));
        Object object = invocation.proceed();
        return object;
    }
}
