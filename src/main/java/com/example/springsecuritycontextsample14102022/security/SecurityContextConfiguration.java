package com.example.springsecuritycontextsample14102022.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.annotation.PostConstruct;

@Configuration
public class SecurityContextConfiguration {

    @Value("${spring.security.context.strategy}")
    private String securityContextStrategy;

    @PostConstruct
    public void init() {
        SecurityContextHolder.setStrategyName(securityContextStrategy);
    }
}
