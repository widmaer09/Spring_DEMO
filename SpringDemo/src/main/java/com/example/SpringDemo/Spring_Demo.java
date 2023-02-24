package com.example.SpringDemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Spring_Demo {

    public static void main(String[] args) {

        //load config file
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("app.xml");

        //retrieve the bean form spring container

        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach theCoach2 = context.getBean("myCoach2", Coach.class);

       // Coach theCoach3= context.getBean("myCricketCoach",Coach.class);
        CricketCoach theCoach3 = context.getBean("myCricketCoach", CricketCoach.class);









        // call methods on the bean

        //  System.out.println(theCoach.getDailyWorkout());
        // System.out.println(theCoach.getDailyFortune());

        // System.out.println(theCoach2.getDailyWorkout());
        // System.out.println(theCoach2.getDailyFortune());

        System.out.println(theCoach3.getDailyWorkout());
        System.out.println(theCoach3.getDailyFortune());
        System.out.println(theCoach3.getEmailAddress());
        System.out.println(theCoach3.getTeam());


        //close the context

        context.close();

    }

}
