package com.cyber.services;

import com.cyber.interfaces.Course;
import com.cyber.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Java implements Course {

private ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {

        System.out.println("Calculating Java hours as :" +(20 + extraSessions.getHours()));
    }
}
