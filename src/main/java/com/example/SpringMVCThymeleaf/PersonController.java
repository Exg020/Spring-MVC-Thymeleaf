package com.example.SpringMVCThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class PersonController {
    @GetMapping
    String getPeople(Model model){
        model.addAttribute("something","This is coming from the controller");
        model.addAttribute("people", Arrays.asList(
                new Person("John",28),
                new Person("bill",23),
                new Person("Simon",22)
        ));
        return "people";
    }
}
