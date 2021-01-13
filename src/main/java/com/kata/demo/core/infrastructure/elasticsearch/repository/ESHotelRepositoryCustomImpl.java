package com.kata.demo.core.infrastructure.elasticsearch.repository;

import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;

import java.util.List;

public class ESHotelRepositoryCustomImpl implements ESHotelRepositoryCustom {
    private final ElasticsearchOperations operations;

    public ESHotelRepositoryCustomImpl(ElasticsearchOperations operations) {
        this.operations = operations;
    }

    @Override
    public List<String> searchWithin(GeoPoint geoPoint, Double distance, String unit) {
       return null;
    }
}
