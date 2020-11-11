package com.cyber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping
    public String getRequestMapping(){

        return "home";
    }

    @RequestMapping("/login")
    public String getRequestMapping_login(){

        return "login";
    }

    @GetMapping("/i-90")
    public String getRequestMapping_i_ninety(){

        return "i-90-form";
    }
    @PostMapping("/i-90-respond")
    public String getRequestMapping_i_ninety_respond(){

        return "i-90-respond";
    }

    @GetMapping("/home/{name}")
    public String pathVariableEx(@PathVariable("name") String name){
        System.out.println("Name is: "+name);
        return "home";
    }

    @GetMapping("/home/{name}/{email}")
    public String pathVariableEx2(@PathVariable("name") String name, @PathVariable("email") String email){
        System.out.println("Name is "+ name );
        System.out.println("Email is: "+ email);
        return "home";
    }

    @GetMapping("home/course")
    public String requestParamExample(@RequestParam("course") String course){
        System.out.println("Course is: "+ course);
        return "home";
    }

    @GetMapping(value="/course")
    public String requestParam2(@RequestParam(value="name", required = false, defaultValue = "Cybertek") String name){
        System.out.println("Course is: "+name);
        return "home";
    }
}
