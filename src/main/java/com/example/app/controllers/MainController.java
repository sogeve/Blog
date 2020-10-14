package com.example.app.controllers;

import com.example.app.entities.Article;
import com.example.app.services.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final ArticleService articleService;

//    @RequestMapping("/testt")
//    public String index(){
//        return "index.html";
//    }

//    @GetMapping(value = "/{category}/page/{pageNumber}")
    @GetMapping(value = "/maintest")
    public ModelAndView index () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }

    @RequestMapping("/main")
    public String displayIndex(){
        return "test main";
    }

    @RequestMapping("/test")
    public List<Article> displayTest(){
        List<Article> allArticles = articleService.getAllArticles();
        return allArticles;
    }

    @RequestMapping("/blog")
    public String displayinfo(){
        return "jestem Arek, to jest opis bloga";
    }

    @GetMapping(value = "/rest/{category}/page/{pageNumber}")
    public List<Article> getPagedArtcilesByCategory(@PathVariable String category, @PathVariable int pageNumber){

        List<Article> paged = articleService.getArticlesByCategory(category, pageNumber,5);

        return paged;
    }

}
