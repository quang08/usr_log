package com.elasticSearch.elasticsearch.controllers;

import com.elasticSearch.elasticsearch.services.UserLogProductResService;
import com.elasticSearch.elasticsearch.services.UserLogProductService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLogProductResController {
    private UserLogProductResService userLogProductResService;

    public UserLogProductResController(UserLogProductResService userLogProductResService) {
        this.userLogProductResService = userLogProductResService;
    }
}
