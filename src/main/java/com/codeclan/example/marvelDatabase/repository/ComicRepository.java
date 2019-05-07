package com.codeclan.example.marvelDatabase.repository;

import com.codeclan.example.marvelDatabase.models.Comic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComicRepository extends JpaRepository<Comic, Long> {
}
