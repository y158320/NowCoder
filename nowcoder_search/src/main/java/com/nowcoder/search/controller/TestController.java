package com.nowcoder.search.controller;

import com.nowcoder.search.dao.ArticleSearchDao;
import com.nowcoder.search.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    ArticleSearchDao articleSearchDao;

    @RequestMapping("/save")
    public String say()
    {
        Article article=new Article();
        article.setContent("1");
        article.setId("2");
        article.setState("3");
        article.setTitle("4");
        articleSearchDao.save(article);
        return "1";
    }

    @RequestMapping("/get")
    public String get()
    {
        Iterable<Article> iterable=articleSearchDao.findAll();
//        iterable.forEach();
        return "1";
    }

}
