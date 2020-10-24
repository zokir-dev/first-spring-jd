package com.cyber.services;

import com.cyber.interfaces.Course;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    @Value("DJ1")
    private String batch;

    @Value("${instructor}")
    private String instructor;

    @Value("${days}")
    private String days;

    @Override
    public String toString() {
        return "Java{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days='" + days + '\'' +
                '}';
    }

    @Override
    public void getTeachingHours() {

        System.out.println("Calculating Java hours as 20");
    }
}
