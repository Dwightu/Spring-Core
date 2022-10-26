package com.lu2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Order(2)
@Aspect
@Component
public class MyApiAnalyticsAspect {
    @Before("execution(public * add*(..))")
    public void beforeAddAccountAdvice() {
        System.out.println("I am final@@@@@@");
    }
}
