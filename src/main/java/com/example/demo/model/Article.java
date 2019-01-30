package com.example.demo.model;

public class Article {
    private String title;

    public Article() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Article(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                '}';
    }
}
