package com.codeclan.example.marvelDatabase.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table(name="entities")
public class Recommendation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long recommendedById;
    @Column
    private Long recommendedForId;
    @Column
    private Long comicId;
    @Column
    private String date;


    public Recommendation(Long recommendedById, Long recommendedForId, Long comicId, String date) {
        this.recommendedById = recommendedById;
        this.recommendedForId = recommendedForId;
        this.comicId = comicId;
        this.date = date;
    }

    public Recommendation() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRecommendedById() {
        return recommendedById;
    }

    public void setRecommendedById(Long recommendedById) {
        this.recommendedById = recommendedById;
    }

    public Long getRecommendedForId() {
        return recommendedForId;
    }

    public void setRecommendedForId(Long recommendedForId) {
        this.recommendedForId = recommendedForId;
    }

    public Long getComicId() {
        return comicId;
    }

    public void setComicId(Long comicId) {
        this.comicId = comicId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}


