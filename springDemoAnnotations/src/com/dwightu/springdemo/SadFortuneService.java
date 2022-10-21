package com.dwightu.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        // TODO Auto-generated method stub
        return "This is so sad...TAT";
    }

}
