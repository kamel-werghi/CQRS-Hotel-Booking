package com.kata.demo.core.infrastructure.elasticsearch.repository;

import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.Query;

import java.util.List;

public class ESHotelRepositoryCustomImpl implements ESHotelRepositoryCustom {
    private final ElasticsearchOperations operations;

    public ESHotelRepositoryCustomImpl(ElasticsearchOperations operations) {
        this.operations = operations;
    }

    @Override
    public List<String> searchWithin(Query query) {
        return null;
    }
}
