package com.kata.demo.core.infrastructure.elasticsearch.repository;

import org.springframework.data.elasticsearch.core.geo.GeoPoint;
import org.springframework.data.elasticsearch.core.query.Query;

public class QueryGenerator {
    public static Query generateHotelSearchQuery(GeoPoint geoPoint, double distance, String unit){
        return null;
    }
}
