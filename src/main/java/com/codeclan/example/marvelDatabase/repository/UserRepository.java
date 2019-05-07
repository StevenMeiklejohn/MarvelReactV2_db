package com.codeclan.example.marvelDatabase.repository;

import com.codeclan.example.marvelDatabase.models.User;
import com.codeclan.example.marvelDatabase.projections.embedUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = embedUsers.class)
public interface UserRepository extends JpaRepository<User, Long> {

    User findDistinctUsersByUserName(String name);

}
