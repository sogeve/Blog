package com.example.app;

import com.example.app.entities.Article;
import com.example.app.services.ArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories
@SpringBootApplication
public class AppApplication {

    private static final Logger log = LoggerFactory.getLogger(AppApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }


    @Bean
    public CommandLineRunner clr(ArticleService articleService){
        return args -> {
            articleService.addArticle("example artisdrcle", "java", "images/example.png", "fff-eeee-yyyy", "descripriiothxcbbnnnn");
            articleService.addArticle("example arti645cle",  "java", "images/example.png", "fff-eeee-yyyy", "descriprifzszviotnnnn");
            articleService.addArticle("example artihgfcle", "java", "images/example.png", "fff-eeee-yyyy", "descripriifxdfgzotnnnn");
            articleService.addArticle("example artiser4cle","java", "images/example.png", "fff-eeee-yyyy", "descripriixcvcvcvxrotnnnn");
            articleService.addArticle("example artizdfcle","java", "images/example.png", "fff-eeee-yyyy", "descripri,gkukt6iotnnnn");
            articleService.addArticle("example artizdfcle", "java", "images/example.png", "fff-eeee-yyyy", "descripri,gkukt6iotnnnn");
            articleService.addArticle("example artizdfcle","java", "images/example.png", "fff-eeee-yyyy", "descripri,gkukt6iotnnnn");
            articleService.addArticle("example artizdfcle","java", "images/example.png", "fff-eeee-yyyy", "descripri,gkukt6iotnnnn");


            List<Article> javaArticles = articleService.getArticlesByCategory("java",0,5);
            log.info("Event java: {}", javaArticles);

            log.info("ne line----------------------------------------------------------------------------------");
            List<Article> javaArticles2 = articleService.getArticlesByCategory("java",1,5);
            log.info("Event java: {}", javaArticles2);
        };
    }
}
