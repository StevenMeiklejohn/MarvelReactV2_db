package com.codeclan.example.marvelDatabase.configurations;

import com.codeclan.example.marvelDatabase.models.ApiData;
import com.codeclan.example.marvelDatabase.models.Comic;
import com.codeclan.example.marvelDatabase.models.Recommendation;
import com.codeclan.example.marvelDatabase.models.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class SpringDataRestGlobalConfig extends RepositoryRestConfigurerAdapter {

    private static final String CORS_BASE_PATTERN = "/**";
    private static final String ALLOWED_ORIGINS = "*";
    private static final String ALLOWED_HEADERS = "*";
    private static final String ALLOWED_METHODS = "*";

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.getCorsRegistry()
                .addMapping(CORS_BASE_PATTERN)
                .allowedOrigins(ALLOWED_ORIGINS)
                .allowedHeaders(ALLOWED_HEADERS)
                .allowedMethods(ALLOWED_METHODS);
        config.exposeIdsFor(ApiData.class, Character.class, Comic.class, Recommendation.class, User.class, ApiData.class);
    }
}
