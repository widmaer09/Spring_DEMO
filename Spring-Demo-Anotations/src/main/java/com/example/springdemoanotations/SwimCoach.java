package com.example.springdemoanotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwimCoach implements Coach {
    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;

    public String getEmail() {
        return email;
    }



    public String getTeam() {
        return team;
    }



    public SwimCoach(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "swim 1000 meters as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
}
