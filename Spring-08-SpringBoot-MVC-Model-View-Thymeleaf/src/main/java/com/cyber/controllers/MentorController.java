package com.cyber.controllers;

import com.cyber.enums.Gender;
import com.cyber.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/mentor-list")
    public String showMentorsTable(Model model){
        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("John", "Smith", 45, Gender.MALE  ));
        mentorList.add(new Mentor("Jack", "Grealish", 23, Gender.MALE  ));
        mentorList.add(new Mentor("Bruno", "Fernandes", 25, Gender.MALE  ));

        model.addAttribute("mentors", mentorList);

        return "mentor/mentor-list";
    }
}
