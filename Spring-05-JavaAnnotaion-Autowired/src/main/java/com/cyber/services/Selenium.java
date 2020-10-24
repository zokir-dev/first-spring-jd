package com.cyber.services;

import com.cyber.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    //@Autowired  -> can be used as field injection
    private OfficeHours officeHours;

    @Override
    public void getTeachingHours() {
        System.out.println("Calculating Selenium hours as: "+ (20 + officeHours.getHours()));
    }

    // Setter injection
    @Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
}
