package com.elasticSearch.elasticsearch.services.impl;

import com.elasticSearch.elasticsearch.repositories.UserLogProductRepo;
import com.elasticSearch.elasticsearch.repositories.UserLogProductResRepo;
import com.elasticSearch.elasticsearch.services.UserLogProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLogProductResServiceImpl implements UserLogProductService {
    private UserLogProductResRepo userLogProductResRepo;

    @Autowired
    public UserLogProductResServiceImpl(UserLogProductResRepo userLogProductResRepo) {
        this.userLogProductResRepo = userLogProductResRepo;
    }
}
