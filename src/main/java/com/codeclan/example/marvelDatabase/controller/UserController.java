package com.codeclan.example.marvelDatabase.controller;


import com.codeclan.example.marvelDatabase.models.User;
import com.codeclan.example.marvelDatabase.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserRepository userRepository;


    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")

    @GetMapping(value = "/users/findByUserName/{userName}")
    public User getUserByUserName(@PathVariable String userName){
        return userRepository.findDistinctUsersByUserName(userName);
    }
}
