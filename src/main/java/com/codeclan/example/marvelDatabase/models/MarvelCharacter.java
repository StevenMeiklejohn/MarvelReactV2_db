package com.codeclan.example.marvelDatabase.models;

import javax.persistence.*;


@Entity
@Table(name="marvel_characters")
public class MarvelCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="marvelId")
    private int marvelId;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="resourceURI")
    private String resourceURI;
    @Column(name="thumbnail")
    private String thumbnail;


    public MarvelCharacter(int marvelId, String name, String description, String resourceURI, String thumbnail){
        this.marvelId = marvelId;
        this.name = name;
        this.description = description;
        this.resourceURI = resourceURI;
        this.thumbnail = thumbnail;
    }

    public MarvelCharacter(){

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
