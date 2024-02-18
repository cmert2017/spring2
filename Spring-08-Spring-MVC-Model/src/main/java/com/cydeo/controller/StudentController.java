package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {
    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC");

        String subject = "Collections";
        model.addAttribute("subject",subject);


        //create some random studentid(0-1000) and how it in your ui

        int studentID = (int)(Math.random()*1000);
        model.addAttribute("studentID",studentID);

        int studentID2 =new Random().nextInt();
        model.addAttribute("studentID2",studentID2);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(-10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(45);
        model.addAttribute("numbers",numbers);

        Student student1 = new Student(1,"John","Smith");

        model.addAttribute("student1",student1);



        return "student/welcome";
    }
}
