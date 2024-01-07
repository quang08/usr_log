package com.elasticSearch.elasticsearch.controllers;

import com.elasticSearch.elasticsearch.services.UserLogProductService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLogProductController {
    private UserLogProductService userLogProductService;

    public UserLogProductController(UserLogProductService userLogProductService) {
        this.userLogProductService = userLogProductService;
    }
}
