package com.example.SpringDemo;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Today you will attack the day with valor";
    }
}
