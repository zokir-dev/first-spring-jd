package com.cyber.services;

import com.cyber.interfaces.Course;
import com.cyber.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Value("${instructor}")
    private String instructorName;
    private ExtraSessions extraSessions;

    @Autowired
    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public int getTeachingHours() {
        return 25 + extraSessions.getExtraHours();
    }

    public String getInstructorName(){
        return instructorName;
    }
}
