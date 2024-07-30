package com.example.KnowTheBean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "In the Badminton";
    }
    public BadmintonCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff(): "+getClass().getSimpleName());
    }
    @PreDestroy
    public void destroyMyStuff(){
        System.out.println("In destroyMyStuff(): "+getClass().getSimpleName());
    }
}
