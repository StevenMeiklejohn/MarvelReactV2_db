package com.codeclan.example.marvelDatabase.repository;

import com.codeclan.example.marvelDatabase.models.MarvelCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;


public interface CharacterRepository extends JpaRepository<MarvelCharacter, Long> {
}
