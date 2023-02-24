package com.example.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScope {

    public static void main(String[] args) {

        //load config file
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("app-scopes.xml");

        //retrieve the bean form spring container

        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean result =(theCoach == alphaCoach);
        System.out.println("does it point to the same address: "+result);

        System.out.println(" address for the coach :"+theCoach);

        System.out.println("address for the coach"+alphaCoach);











        // call methods on the bean




        //close the context

        context.close();

    }
}
