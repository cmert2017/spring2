package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container =  new AnnotationConfigApplicationContext(ConfigApp.class,ConfigAny.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount();


        //PartTimeMentor pt = container.getBean("p1",PartTimeMentor.class); //first method use name key
        PartTimeMentor pt = container.getBean(PartTimeMentor.class); //second method use @Primary annotation


        pt.createAccount();


        String employee = container.getBean(String.class);
        System.out.println("employee = " + employee);


    }
}
