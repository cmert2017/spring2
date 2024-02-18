package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("mentor")
public class MentorController {

    @RequestMapping("/list")  //localhost:8080/mentor/list
    public String mentorPage(Model model){

        Mentor mentor1 = new Mentor("Dato","Turashvili",23, Gender.Male);
        model.addAttribute("mentor1",mentor1);

        Mentor mentor2 = new Mentor("Larisa","Chi",44,Gender.Female);
        model.addAttribute("mentor2",mentor2);

        Mentor mentor3 = new Mentor("Ali","Guclu",33,Gender.Male);
        model.addAttribute("mentor3",mentor3);


        //or we could use lists
        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Lale","Yigit",38,Gender.Female));
        mentorList.add(new Mentor("Taylor","Lol",55,Gender.Male));
        mentorList.add(new Mentor("Kiraz","Yasar",23,Gender.Female));

        model.addAttribute("mentorList",mentorList);

        return "/mentor/welcome";
    }

}
