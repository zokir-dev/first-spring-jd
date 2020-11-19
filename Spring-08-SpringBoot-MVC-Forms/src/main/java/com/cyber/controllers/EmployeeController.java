package com.cyber.controllers;

import com.cyber.dataGenerator.DataGenerator;
import com.cyber.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.Arrays;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/register")
    public String showRegisterPage(Model model){

        model.addAttribute("employee",new Employee());
        model.addAttribute("states", DataGenerator.getStateList());
        return "/employee/employee-register";
    }

    @PostMapping("/list")       //(@Modelattribute("employee") Employee employee, Model model)
    public String employeeList(@ModelAttribute("employee") Employee employee, Model model){

        model.addAttribute("employeeList", Arrays.asList(employee ));
        int birthYear = LocalDate.parse(employee.getBirthDay()).getYear();
        model.addAttribute("age", LocalDate.now().getYear()-birthYear);
        return "employee/employee-list";
    }


}
