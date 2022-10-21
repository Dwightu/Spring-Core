package com.dwightu.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
    
    // Three kinds of injection： field, constructor and setter
    
    
    // field injection
    // Qualifier used to specify the bean
    
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;
    
    // define my init method
//    @PreDestory
//    public void doMyStartupStuff() {
//        System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
//    }
    


    @Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}

    @Override
    public String getDailyFortune() {
        // TODO Auto-generated method stub
        return fortuneService.getFortune();
    }

}
