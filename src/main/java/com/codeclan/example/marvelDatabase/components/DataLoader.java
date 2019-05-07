package com.codeclan.example.marvelDatabase.components;

import com.codeclan.example.marvelDatabase.models.*;
import com.codeclan.example.marvelDatabase.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CharacterRepository characterRepository;

    @Autowired
    ComicRepository comicRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RecommendationRepository recommendationRepository;

    @Autowired
    ApiDataRepository apiDataRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {

//        MarvelCharacter dummyCharacter = new MarvelCharacter(123456,
//                "dummy",
//                "dummy description",
//                "www.resourceURI.com",
//                "http://gateway.marvel.com/v1/public/characters/1011334");
//
//        characterRepository.save(dummyCharacter);

//
//        Comic dummyComic = new Comic(
//                134567,
//                "The Killing Joke",
//                "www.thumbnail.com",
//                "www.link.com"
//        );
//
//        comicRepository.save(dummyComic);
//
//        Comic dummyComic2 = new Comic(
//                134567,
//                "The Killing Jip",
//                "www.thumbnail.com",
//                "www.link.com"
//        );
//
//        comicRepository.save(dummyComic2);
//
//        User user1 = new User("Steve", "Meiklejohn", "SteveMeiklejohn", "123");
//        userRepository.save(user1);
//
//        User user2 = new User("Eddie", "Hitler", "Elizabeth", "123");
//        userRepository.save(user2);
//
//        Recommendation recommendation1 = new Recommendation(user1.getId(), user2.getId(), dummyComic.getId(), "today");
//        recommendationRepository.save(recommendation1);
//
//        Recommendation recommendation2 = new Recommendation(user2.getId(), user1.getId(), dummyComic2.getId(), "today");
//        recommendationRepository.save(recommendation2);
//
//        ApiData dummyApiData = new ApiData("dummy data dummy data dummy data");
//        apiDataRepository.save(dummyApiData);
//
//
//
//
    }


}
