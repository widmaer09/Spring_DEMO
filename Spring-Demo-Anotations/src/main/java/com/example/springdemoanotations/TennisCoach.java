package com.example.springdemoanotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") explicit bean id

@Component()
public class TennisCoach implements Coach{

    private FortuneService fortuneService;

    /* @Autowired
    public TennisCoach(FortuneService theFortuneService){
        fortuneService= theFortuneService;
    }*/
    @Autowired
    @Qualifier("randomFortuneService")
    public  void setForutne(FortuneService theFortuneService){
         this.fortuneService =  theFortuneService;

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
