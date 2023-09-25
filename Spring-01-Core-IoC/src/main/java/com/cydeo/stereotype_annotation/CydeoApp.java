package com.cydeo.stereotype_annotation;

import com.cydeo.bean_annotation.FullTimeMentor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigCourse.class);

        context.getBean(Java.class).getTeachingHours();

    }

}
