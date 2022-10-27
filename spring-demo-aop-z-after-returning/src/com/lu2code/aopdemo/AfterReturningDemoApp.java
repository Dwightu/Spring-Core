package com.lu2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lu2code.aopdemo.dao.AccountDAO;

public class AfterReturningDemoApp {
    public static void main(String[] args) {
        
        // read spring config java class
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(DemoConfig.class);
        
        
        // get the bean from spring container
        AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
        
        
        Account myAccount=new Account();
        myAccount.setName("Madhu");
        myAccount.setName("Platinum");
        
        // call the business method
        theAccountDAO.addAccount(myAccount);
        
        
        // close the context
        context.close();
        
        
    }
}
