package com.cyber.services;

import com.cyber.interfaces.Course;
import lombok.Data;


public class Selenium implements Course {


    @Override
    public void getTeachingHours() {
        System.out.println("Selenium weekly teaching hours: 16");
    }

}
