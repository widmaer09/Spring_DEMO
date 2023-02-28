package com.example.springdemoanotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{
    private String[] data= {"Beware of wolf in sheep clothing","Diligence is the mother of good luck","the journey is the reward"};

    //random gen
    private Random myRandom = new Random();



    @Override
    public String getFortuneService() {
        //pick random number

        int index=myRandom.nextInt(data.length);

        String thefortune = data[index];
        return thefortune;
    }
}
