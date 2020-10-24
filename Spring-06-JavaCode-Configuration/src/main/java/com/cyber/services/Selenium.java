package com.cyber.services;

import com.cyber.interfaces.Course;
import org.springframework.stereotype.Component;

public class Selenium implements Course {

    @Override
    public void getTeachingHours() {

        System.out.println("Calculating selenium hours as 25");
    }
}
