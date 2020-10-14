package com.example.app.entities;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Data
public class Article {

    Timestamp articleDate = new Timestamp(System.currentTimeMillis());

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private long date = articleDate.getTime();

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String imgUrl;

    @Column(nullable = false)
    private String url;

    @Column(nullable = false)
    private String description;

}