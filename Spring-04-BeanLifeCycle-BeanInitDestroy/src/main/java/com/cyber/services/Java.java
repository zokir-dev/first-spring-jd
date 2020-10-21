package com.cyber.services;

import com.cyber.interfaces.Course;
import lombok.Data;

public class  Java implements Course {


    @Override
    public void getTeachingHours() {
        System.out.println("Java weekly teaching hours: 30 ");
    }

    public void myInitMethod(){
        System.out.println("Init method executed");
    }

    public void myDestroyMethod(){
        System.out.println("Destroy method executed");
    }
}
