package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/another")
public class AnotherController {


    @RequestMapping("/Mentors") //localhost:8080/another/Mentors
    public String mentorPage(Model model){

        return "/mentor/welcome";
    }

}
