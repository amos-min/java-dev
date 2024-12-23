package com.example.demo;

import com.example.demo.dao.ArticleRepository;
import com.example.demo.entity.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.Date;

@SpringBootTest
class DemoApplicationTests {


    @Autowired
    ArticleRepository articleRepository;


    @Test
    void contextLoads() throws IOException {
        Article article = new Article();
        article.setId("112233");
        article.setTitle("java");
        article.setContent("hello world");
        article.setUserId(22221111);
        article.setCreateTime(new Date());
        articleRepository.save(article);
    }

}
