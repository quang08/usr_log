package com.elasticSearch.elasticsearch.repositories;

import com.elasticSearch.elasticsearch.entities.UserLogProductEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLogProductResRepo extends ElasticsearchRepository<UserLogProductEntity, String> {
}