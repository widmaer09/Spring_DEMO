package com.example.springdemoanotations;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") explicit bean id

@Component()
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
