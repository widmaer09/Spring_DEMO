package com.example.SpringDemo;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void lol(){
        System.out.println("lol");
    }

    public String getTeam() {
        return team;
    }

    private String emailAddress;



    private  String team;








    //create a no arg constructor

    public CricketCoach(){
        System.out.println("CricketCoach:inside no-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling";
    }

    @Override
    public String getDailyFortune() {
        return "CricketCoach:"+fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void domyStartUpStuff(){
        System.out.println("CricketCoach Coach do my start up stuff");
    }

    //add destroy method

    public void domyCloseUpStuff(){
        System.out.println("CricketCoach do my close up stuff");
    }
}
