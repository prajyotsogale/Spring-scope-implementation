package com.example.KnowTheBean;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "This is tennis workout";
    }
    public TennisCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }
}
