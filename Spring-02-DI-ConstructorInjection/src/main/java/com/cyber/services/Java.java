package com.cyber.services;

import com.cyber.interfaces.Course;
import com.cyber.interfaces.ExtraSessions;

public class  Java implements Course {

    //OfficeHours officeHours;
    ExtraSessions extraSessions;
    @Override
    public void getTeachingHours() {
        System.out.println("Java weekly teaching hours: "+ (20 + extraSessions.getHours()));
    }

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }
}
