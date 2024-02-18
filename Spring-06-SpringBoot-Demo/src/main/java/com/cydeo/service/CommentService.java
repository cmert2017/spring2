package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") //this means create different beans in the container or you can do the following
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Lazy // instead of eager we specify it as Lazy so it will create bean whenever they are encountered.
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;


    //public CommentService(CommentRepository commentRepository,@Qualifier("commentPushNotificationProxy") CommentNotificationProxy commentNotificationProxy) { //we use inside the @Qualifier the default bean name which is assigned by Spring
    public CommentService(CommentRepository commentRepository, @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) { //here we use custom name way
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
        System.out.println("Hello ");
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);

    }
}

