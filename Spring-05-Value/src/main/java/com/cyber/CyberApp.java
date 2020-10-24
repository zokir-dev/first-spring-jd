package com.cyber;

import com.cyber.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CyberApp {

    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course1 = container.getBean("java", Course.class);

        System.out.println(course1.toString());
//        course1.getTeachingHours();
//
//        course1 = container.getBean("selenium", Course.class);
//        course1.getTeachingHours();
//        //Course course2 = container.getBean("javaHrs", Course.class);
//
//        course1 = container.getBean("api", Course.class);
//        course1.getTeachingHours();


    }
}
