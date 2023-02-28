package com.example.springdemoanotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaconfigdemo {
  public static void main(String[] args) {

      //read spring config file

      AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(SportsConfigWIthJava.class);

      //get the bean from the spring container

      SwimCoach theCoach= context.getBean("swimCoach",SwimCoach.class);

      //call a method on the bean

      System.out.println(theCoach.getDailyWorkout());

      //call method that gets the daily fortune
      System.out.println(theCoach.getDailyFortune());

      //call our new swim coach method.has the props values injected

      System.out.println("email:"+ theCoach.getEmail());

      //call our new swim coach method.has the props values injected
      System.out.println("email:"+ theCoach.getTeam());






      //close the context

      context.close();




    }
}
