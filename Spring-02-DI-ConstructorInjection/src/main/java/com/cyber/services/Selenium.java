package com.cyber.services;

import com.cyber.interfaces.Course;

public class Selenium implements Course {

    OfficeHours officeHours;

    @Override
    public void getTeachingHours() {
        System.out.println("Selenium weekly teaching hours: "+ (15 + officeHours.getHours()));
    }

    public Selenium(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
}
