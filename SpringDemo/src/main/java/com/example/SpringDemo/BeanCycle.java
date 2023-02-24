package com.example.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCycle {

    public static void main(String[] args) {

        //load config file
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("app-cycle.xml");

        //retrieve the bean form spring container

        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);




        System.out.println( theCoach.getDailyFortune());













        // call methods on the bean




        //close the context

        context.close();

    }
}
