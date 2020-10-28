package com.cyber.services;

import com.cyber.interfaces.Course;
import com.cyber.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Java implements Course {

    private ExtraSessions extraSessions;


    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {

        System.out.println("Calculating Java hours as :" +(20 + extraSessions.getHours()));
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Executing post construct...");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Executing pre destroy method....");
    }

}
