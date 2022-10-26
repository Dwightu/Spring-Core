package com.lu2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.lu2code.aopdemo.Account;

@Component
public class AccountDAO {
    
    public void addAccount(Account theAccount) {
        System.out.println(getClass()+" : Doing my db work: adding an account");
        
    }
}
