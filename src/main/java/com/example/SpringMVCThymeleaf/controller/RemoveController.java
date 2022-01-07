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
public class RemoveController {
    @Autowired
    private GymService9 gymService9;

    @GetMapping("/remove")
    public String removeGym(Model model){
        Gym9 gym9 = new Gym9();
        int gymId = 0;
        model.addAttribute("gymId",gymId);
        model.addAttribute("activePage","remove");
        return "remove";
    }

    @PostMapping("/remove")
    public String formPost(@ModelAttribute("gymId") int id, Model model){
       gymService9.deleteById(id);
        return "index";
    }


}
