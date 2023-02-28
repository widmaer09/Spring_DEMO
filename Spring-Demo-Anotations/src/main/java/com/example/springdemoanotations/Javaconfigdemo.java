package com.example.springdemoanotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Javaconfigdemo {
  public static void main(String[] args) {

      //read spring config file

      AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(SportsConfigWIthJava.class);

      //get the bean from the spring container

      Coach theCoach= context.getBean("tennisCoach",Coach.class);

      //call a method on the bean

      System.out.println(theCoach.getDailyWorkout());

      //call method that gets the daily fortune
      System.out.println(theCoach.getDailyFortune());





      //close the context

      context.close();




    }
}
