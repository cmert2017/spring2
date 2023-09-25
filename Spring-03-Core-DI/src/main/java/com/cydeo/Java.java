package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {

    /*
    //1-Field Injection
    @Autowired
    OfficeHours officeHours;
    */


    //2-Constructor injection
    OfficeHours officeHours;
    /*
    @Autowired //after spring 4.3 we dont need to put @autowired if there is only one constructor. Also lombok annotation can do it alone without any constructor
    public Java(OfficeHours officeHours){
        this.officeHours = officeHours;
    }
    */

    public void getTeachingHours(){
        //System.out.println("Weekly Teaching hours : 70");
        System.out.println("Weekly Teaching hours : "+ (20 + officeHours.getHours()));
    }

}
