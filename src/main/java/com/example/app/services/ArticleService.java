package com.example.app.services;


import com.example.app.entities.Article;
import com.example.app.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import org.springframework.data.domain.Pageable;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ArticleService {

//    @Autowired
    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public Article addArticle(String title, String category, String imgUrl, String url, String description){

        Article article = new Article();
        article.setTitle(title);
        article.setCategory(category);
        article.setImgUrl(imgUrl);
        article.setUrl(imgUrl);
        article.setDescription(description);

        return articleRepository.save(article);
    }

    public List<Article> getAllArticles() {
        return (List<Article>) articleRepository.findAll();
    }

//    public List<Article> getJavaArticles() { return  (List<Article>) articleRepository.getArticlesByCategory("java");}

    public List<Article> getArticlesByCategory(String category, int pageNumber, int pageSize){

        if (pageNumber < 1) {
            pageNumber = 0;
        } else {
            pageNumber--;
        }

        Pageable paging = PageRequest.of(pageNumber,pageSize,Sort.by("date").ascending());

        Page pagedResult = articleRepository.findByCategory(category, paging);

        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return null;
        }

//            return pagedResult;



    }
}
