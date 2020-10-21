package com.cyber;

import com.cyber.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CyberApp {

    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course = container.getBean("javaHrs", Course.class);
        course.getTeachingHours();

        ((ClassPathXmlApplicationContext)container).close();
//        course = (Course)container.getBean("seleniumHrs");
//        course.getTeachingHours();

        //trying built in committing

    }
}
