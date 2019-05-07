package com.codeclan.example.marvelDatabase.projections;

import com.codeclan.example.marvelDatabase.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedUsers", types = User.class)
public interface embedUsers {
    long getId();
    String getFirstName();
    String getLastName();
    String getUserName();
    String getPassword();
}

