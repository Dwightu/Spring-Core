package com.dwightu.springdemo;

public class SwimCoach implements Coach {
    
    private FortuneService fortuneService;
    
    public SwimCoach(FortuneService theFortuneService) {
        fortuneService=theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Swim 1000 meters as a warm up.";
    }

    @Override
    public String getDailyFortune() {
        // TODO Auto-generated method stub
        return fortuneService.getFortune();
    }

}
