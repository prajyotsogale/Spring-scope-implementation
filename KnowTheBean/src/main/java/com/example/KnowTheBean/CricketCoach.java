package com.example.KnowTheBean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "E vedya ye bat ka grip nikal ke....";
    }

    public CricketCoach(){
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
