package com.codeclan.example.marvelDatabase.models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="comics")
public class Comic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column
    public int marvelId;
    @Column
    public String title;
    @Column
    public String thumbnail;
    @Column
    public String link;
//    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
//    @OneToMany(mappedBy = "ship", fetch = FetchType.LAZY)
//    public List<Recommendation> recommendations;

    public Comic(int marvelId, String title, String thumbnail, String link){
        this.marvelId = marvelId;
        this.title = title;
        this.thumbnail = thumbnail;
        this.link = link;
    }

    public Comic(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMarvelId() {
        return marvelId;
    }

    public void setMarvelId(int marvelId) {
        this.marvelId = marvelId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
