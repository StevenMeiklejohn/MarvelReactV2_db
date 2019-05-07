package com.codeclan.example.marvelDatabase.repository;

import com.codeclan.example.marvelDatabase.models.ApiData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiDataRepository extends JpaRepository<ApiData, Long> {
}
