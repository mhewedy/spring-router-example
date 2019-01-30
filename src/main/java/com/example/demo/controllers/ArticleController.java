package com.example.demo.controllers;

import com.example.demo.model.Article;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Collections;
import java.util.List;

@ResponseBody
public class ArticleController {

    public List<Article> index() {
        return Collections.emptyList();
    }

    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Article article) {
        System.out.println("creating article: " + article);
    }

    public Article show(@PathVariable Long id) {
        return new Article("golang by example");
    }

    public void update(@PathVariable Long id, @RequestBody Article article) {
        System.out.println("updating article: " + id + ", article: " + article);
    }

    public void destroy(@PathVariable Long id) {
        System.out.println("destroying article: " + id);
    }
}
