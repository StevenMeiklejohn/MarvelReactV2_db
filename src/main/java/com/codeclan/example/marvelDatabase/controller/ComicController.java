package com.codeclan.example.marvelDatabase.controller;


import com.codeclan.example.marvelDatabase.repository.ComicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ComicController {

    @Autowired
    ComicRepository comicRepository;



}
