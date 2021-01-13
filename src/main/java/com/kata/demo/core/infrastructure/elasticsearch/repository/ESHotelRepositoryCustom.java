package com.kata.demo.core.infrastructure.elasticsearch.repository;

import org.springframework.data.elasticsearch.core.geo.GeoPoint;

import java.util.List;

public interface ESHotelRepositoryCustom {
    List<String> searchWithin(GeoPoint geoPoint, Double distance, String unit);
}
