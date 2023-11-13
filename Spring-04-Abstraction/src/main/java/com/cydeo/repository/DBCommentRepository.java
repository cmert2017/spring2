package com.cydeo.repository;

import com.cydeo.model.Comment;

public class DBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(@org.jetbrains.annotations.NotNull Comment comment) {
        System.out.println("Storing comment : " + comment.getText());
    }
}
