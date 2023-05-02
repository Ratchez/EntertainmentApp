package com.example.model;

import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    String name;
    @Column
    String language;
    @Column
    String type;
    @Column
    double rate;
    @Column
    String imageUrl;

    public Movie(int id, String name, String language, String type, double rate, String imageurl){
        super();
        this.id = id;
        this.name = name;
        this.language = language;
        this.type = type;
        this.rate = rate;
        this.imageUrl = imageurl;
    }

    public Movie(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
