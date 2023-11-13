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
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        //step3: execute the scenario
        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);

    }
}
