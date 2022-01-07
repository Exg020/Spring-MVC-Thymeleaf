package com.example.SpringMVCThymeleaf.controller;

import com.example.SpringMVCThymeleaf.model.Gym9;
import com.example.SpringMVCThymeleaf.service.GymService9;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddController {

    @Autowired
    private GymService9 gymService9;

    @GetMapping("/add")
    public String addGym(Model model){
        Gym9 gym = new Gym9();
        model.addAttribute("gym",gym);
        model.addAttribute("activePage","add");
        return "add";
    }
    @PostMapping("/add")
    public String formPost(@ModelAttribute("gym") Gym9 gym, Model model){
        gymService9.addGym(gym);
        return "gyms";
    }
}
