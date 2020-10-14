package com.example.app.repositories;

import com.example.app.entities.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

//import java.awt.print.Pageable;


@Repository
public interface ArticleRepository extends PagingAndSortingRepository<Article, Integer> {

    Page <Article> findByCategory(String category, Pageable page);

}
