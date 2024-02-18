package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("car")
public class CarController {
    @RequestMapping("/info")  //localhost:8080/car/info?make=Honda&year=2015
     public String carInfo(@RequestParam String make,@RequestParam Integer year, Model model){

        model.addAttribute("make",make);
        model.addAttribute("year",year);
        //System.out.println(make); this will print to console. just for practicing

        return "car/car-info";
    }

    @RequestMapping("/info2")  //localhost:8080/car/info?make=Honda&year=2015
    public String carInfo2(@RequestParam(value="make",required = false,defaultValue = "Nissan") String make,@RequestParam Integer year, Model model){

        model.addAttribute("make",make);
        model.addAttribute("year",year);
        //System.out.println(make); this will print to console. just for practicing

        return "car/car-info";
    }

    @RequestMapping("/info/{make}")  //localhost:8080/car/info/honda
    public String getCarInfo(@PathVariable String make, Model model){
        model.addAttribute("make",make);
        return "car/car-info";
    }



    @RequestMapping("/info/{make}/{year}")  //localhost:8080/car/info/honda/2015  //<--- here positions/order of keywords important. first make then year should come form URL
    public String getCarInfo(@PathVariable String make,@PathVariable Integer year, Model model){
        model.addAttribute("make",make);  //Path parameters can not be optional
        model.addAttribute("year",year);  //generally one or two parameters
        return "car/car-info";
    }


}
