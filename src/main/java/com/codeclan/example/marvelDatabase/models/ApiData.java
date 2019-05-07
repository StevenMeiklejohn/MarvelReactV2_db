package com.codeclan.example.marvelDatabase.models;


import javax.persistence.*;

@Entity
@Table(name="apidatas")
public class ApiData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    public String dataString;

    public ApiData(String dataString){
        this.dataString = dataString;

    }

    public ApiData(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataString() {
        return dataString;
    }

    public void setDataString(String dataString) {
        this.dataString = dataString;
    }
}
