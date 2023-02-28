package com.example.springdemoanotations;

public class SadFortuneService implements FortuneService{
    @Override
    public String getFortuneService() {
        return "sad fortune";
    }
}
