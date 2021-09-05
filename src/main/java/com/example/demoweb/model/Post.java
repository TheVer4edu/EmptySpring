package com.example.demoweb.model;

import java.util.Date;

public class Post {

    private String text;
    private Integer likes = 0;
    private Date creationDate;
    private Long id;

    public Post(Long id, String text) {
        this.id = id;
        this.text = text;
        this.creationDate = new Date();
    }

    public Post(Long id, String text, Date date) {
        this.id = id;
        this.text = text;
        this.creationDate = date;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Long getId() {
        return id;
    }
}
