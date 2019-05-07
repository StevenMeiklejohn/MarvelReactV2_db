package com.codeclan.example.marvelDatabase.repository;

import com.codeclan.example.marvelDatabase.models.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {
}
