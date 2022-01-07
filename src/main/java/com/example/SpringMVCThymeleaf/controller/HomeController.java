package com.example.SpringMVCThymeleaf.controller;

import com.example.SpringMVCThymeleaf.service.GymService9;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @Autowired
    private GymService9 gymService9;

    @GetMapping()
    public String home(){return "index";}

    @GetMapping("/gyms")
    public String getGyms(Model model){
        model.addAttribute("activePage","gymList");
        model.addAttribute("listOfGyms",gymService9.getAll());
        return "gyms";
    }

   // @GetMapping("/add")
    public String addGym(Model model){
        model.addAttribute("activePage","add");
        return "add";
    }

    @GetMapping("/remove")
    public String removeGym(Model model){
        model.addAttribute("activePage","remove");
        return "remove";
    }



}
