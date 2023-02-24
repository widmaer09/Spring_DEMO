package com.example.springdemoanotations;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") explicit bean id

@Component()
public class TennisCoach implements Coach{

    private FortuneService fortuneService;

    public TennisCoach(FortuneService theFortuneService){
        fortuneService= theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
}
