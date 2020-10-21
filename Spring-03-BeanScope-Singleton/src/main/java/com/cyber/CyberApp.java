package com.cyber;

import com.cyber.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CyberApp {

    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course1 = container.getBean("javaHrs", Course.class);

        Course course2 = container.getBean("javaHrs", Course.class);

        System.out.println("Pointing to the same object: "+ (course1 == course2));

        System.out.println("Memory Location for the course1:"+ course1);
        System.out.println("Memory Location for the course2:"+ course2);


    }
}
