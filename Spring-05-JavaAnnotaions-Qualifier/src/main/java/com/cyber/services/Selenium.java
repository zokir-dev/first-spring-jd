package com.cyber.services;

import com.cyber.interfaces.Course;
import com.cyber.interfaces.ExtraSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    @Autowired
    @Qualifier("officeHours")
   private ExtraSession extraSession;

    @Override
    public void getTeachingHours() {
        System.out.println("Calculating Selenium hours as: "+ (20 + extraSession.getHours()));
    }



}
