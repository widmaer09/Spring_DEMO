package com.example.springdemoanotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan("com.example.springdemoanotations")
@PropertySource("classpath:sport.properties")
public class SportsConfigWIthJava {
    //define bean for our sad fortune service
    @Bean
    public  FortuneService sadFortuneService(){
        return new SadFortuneService();
    }


    //define bean for our swim coach and inject dependency

    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }

}
