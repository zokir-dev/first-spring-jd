package com.cyber.controllers;

import com.cyber.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {


    @GetMapping("/registration")
    public String showForm(Model model){

        Mentor mentor = new Mentor();
        model.addAttribute("mentor",mentor);

        List<String > batchNumbers = Arrays.asList("B5", "B6", "B7", "B8", "B9", "B10", "B11", "B12", "B13");
        model.addAttribute("batches", batchNumbers);

        //System.out.println(mentor.toString());
        return "mentor/registration";
    }

    @PostMapping("/mentor-confirm")
    public String submitForm(@ModelAttribute("mentor") Mentor mentor){

        System.out.println(mentor.toString());


        return "mentor/mentor-confirm";
    }


}
