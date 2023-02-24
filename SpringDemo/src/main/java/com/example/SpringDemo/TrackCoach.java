package com.example.SpringDemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "run around the track for 30 mins";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    //add init method


}
