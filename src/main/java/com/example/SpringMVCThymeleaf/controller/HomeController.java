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

}
