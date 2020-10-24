package com.cyber.services;

import com.cyber.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Calculating Java hours as 20");
    }
}
