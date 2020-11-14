package com.cyber.controllers;

import com.cyber.model.Student;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","John Smith");
        model.addAttribute("course","MVC");

        int studentID = new Random().nextInt(1000);
        model.addAttribute("studentID", studentID);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);
        model.addAttribute("numbers",numbers);
        //LocalDate birthDay =  new LocalDate().now().minusYears(32);

        Student student = new Student(1, "John","Smith");
        model.addAttribute("student", student);

        return "student/welcome";
    }


    @GetMapping("/login")
    public String loginPage(Model model){

        return "student/login";
    }
}
