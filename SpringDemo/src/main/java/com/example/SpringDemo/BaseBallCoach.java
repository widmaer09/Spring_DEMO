package com.example.SpringDemo;

public class BaseBallCoach implements  Coach {


    private FortuneService fortuneService;

    public BaseBallCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 mins in battingCage";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
