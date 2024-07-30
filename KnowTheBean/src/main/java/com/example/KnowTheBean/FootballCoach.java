package com.example.KnowTheBean;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Football lalalalal";
    }
    public FootballCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }
}
