package com.example.app.entities;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class ArticleText {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String text;


}
