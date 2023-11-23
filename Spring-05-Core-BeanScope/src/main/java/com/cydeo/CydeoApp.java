package com.cydeo;

import com.cydeo.config.ProjectConfig;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        //step1:business logic
        Comment comment = new Comment();
        comment.setAuthor("David");
        comment.setText("SpringFramework is cool");

        //step2:create the container
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class); //create the container and then go to config class and create all the beans if it is eager initialization


        //step3: execute the scenario
//        CommentService cs1 = context.getBean(CommentService.class);
//        CommentService cs2 = context.getBean(CommentService.class);
//        System.out.println(cs1);
//        System.out.println(cs2);
//        System.out.println(cs1 == cs2);
//
//
//        cs1.publishComment(comment);
    }
}
