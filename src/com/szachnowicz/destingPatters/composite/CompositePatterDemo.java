package com.szachnowicz.destingPatters.composite;

public class CompositePatterDemo {
    public static void main(String[] args) {
        Comment comment = new Comment("coments text", "seba", "2016");
        Comment subComment = new Comment(" sub coments text", "janusz", "2016");
        Comment subComment2 = new Comment(" sub coments2 text", "janusz", "2016");
        Comment comment2 = new Comment("coments text", "janusz", "2016");

        System.out.println(comment);
        System.out.println(comment2);

        comment.addComment(subComment);
        comment.addComment(subComment2);


        for (Comment comment1 : comment.getSubCommentsList()) {
            System.out.println(comment);
        }


    }
}
