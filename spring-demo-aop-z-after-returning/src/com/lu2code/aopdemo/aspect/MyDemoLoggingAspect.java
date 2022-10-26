package com.lu2code.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.lu2code.aopdemo.Account;

@Aspect
@Component
public class MyDemoLoggingAspect {
    
    // this is where we add all of our related advices for logging
    
    // let's start with an @Before advice
    
    @Pointcut("execution(public * add*(..))")
    private void forDaoPackage() {}
    
    @Before("forDaoPackage()")
    public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
        System.out.println("\n=====>>>> Executing @Before advice on addAccount");
        // display the method signature
        MethodSignature methoSig=(MethodSignature) theJoinPoint.getSignature();
        
        System.out.println("Method: "+methoSig);
        // display method arguments
        
        // get args
        Object[] args=theJoinPoint.getArgs();
        // loop thru args
        for(Object tempArg:args) {
            System.out.println(tempArg);
            if(tempArg instanceof Account) {
                System.out.println("Account name"+ ((Account) tempArg).getName());
            }
        }
    }
}
