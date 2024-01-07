package com.elasticSearch.elasticsearch.services.impl;

import com.elasticSearch.elasticsearch.repositories.UserLogProductRepo;
import com.elasticSearch.elasticsearch.services.UserLogProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLogProductServiceImpl implements UserLogProductService {
    private UserLogProductRepo userLogProductRepo;

    @Autowired
    public UserLogProductServiceImpl(UserLogProductRepo userLogProductRepo) {
        this.userLogProductRepo = userLogProductRepo;
    }
}
