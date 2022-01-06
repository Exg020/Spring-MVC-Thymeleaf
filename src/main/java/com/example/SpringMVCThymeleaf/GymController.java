package com.example.SpringMVCThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class GymController {
/*    @GetMapping
    String getPeople(Model model){
        model.addAttribute("title","Northwest Arkansas Gyms");
        model.addAttribute("people", Arrays.asList(
                new Person("John",28),
                new Person("bill",23),
                new Person("Simon",22)
        ));
        return "people";
    }*/

    @GetMapping
   String getGyms(Model model){
        model.addAttribute("title","Northwest Arkansas Gyms");
     /*   model.addAttribute("gyms",Arrays.asList(
                new Gym(1,"Ozark Iron Gym"," 3801 Johnson Mill Blvd STE C"," ","Johnson","Arkansas",72704),
                new Gym(2,"Elm Street"," 3503 Elm Springs Rd"," ","Springdale","Arkansas",72762),
                new Gym(3,"Anytime Fitness","7058 W Sunset Ave Suite 2"," ","Springdale","Arkansas",72762),
                new Gym(4,"The J Street Gym","2614 SE J St", " ","Bentonville","Arkansas",72712)
        ));*/
        return "newgym";
    }
}
