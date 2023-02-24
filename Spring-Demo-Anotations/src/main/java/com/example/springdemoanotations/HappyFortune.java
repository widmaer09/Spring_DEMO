package com.example.springdemoanotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService{
    @Override

    public String getFortuneService() {
        return "today is your lucky day";
    }
}
