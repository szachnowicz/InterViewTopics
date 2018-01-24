package com.szachnowicz.destingPatters.composite;

import java.util.ArrayList;
import java.util.List;

public class Comment {
    public String commentText;
    private String author;
    private String date;
    private List<Comment> subCommentsList;

    public Comment(String commentText, String author, String date) {
        this.commentText = commentText;
        this.author = author;
        this.date = date;
        subCommentsList = new ArrayList<>();
    }

    public void addComment(Comment comment) {
        subCommentsList.add(comment);

    }

    public void removeComment(Comment comment) {
        subCommentsList.remove(comment);
    }

    public List<Comment> getSubCommentsList() {
        return subCommentsList;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Comment{");
        sb.append("commentText=").append(commentText);
        sb.append(", author=").append(author);
        sb.append(", date=").append(date);
        return sb.toString();
    }
}
