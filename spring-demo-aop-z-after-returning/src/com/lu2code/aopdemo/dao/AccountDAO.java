package com.lu2code.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.lu2code.aopdemo.Account;

@Component
public class AccountDAO {
    
    private String name;
    private String serviceCode;
    
    public List<Account> findAccounts(){
        List<Account> myAccounts=new ArrayList<>();
        
        // create sample accounts
        Account temp1=new Account("Join","sil");
        Account temp2=new Account("Dehui","Yu");

        Account temp3=new Account("hi","ki");

        
        myAccounts.add(temp1);
        myAccounts.add(temp2);
        myAccounts.add(temp3);
        // add them to our accounts list
        
        return myAccounts;
    }
    
    
    public String addAccount(Account theAccount) {
        System.out.println(getClass()+" : Doing my db work: adding an account");
        return "Yes";
    }
}
