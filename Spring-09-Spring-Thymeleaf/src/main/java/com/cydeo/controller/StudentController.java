package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/student")
public class StudentController {

    //@RequestMapping(value = "/register", method = RequestMethod.GET)  <---- this was before spring framework 4.3
    @GetMapping("/register")
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());
        return "student/register";
    }

    //@RequestMapping(value = "/welcome", method = RequestMethod.GET)
    @GetMapping(value = "/welcome")
    public String info(Model model){

        model.addAttribute("students", DataGenerator.createStudent());
        return "student/welcome";
    }

}
