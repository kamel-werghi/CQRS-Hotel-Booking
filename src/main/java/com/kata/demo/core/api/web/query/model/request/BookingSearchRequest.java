package com.kata.demo.core.api.web.query.model.request;

import com.kata.demo.core.domain.dto.BookingSearchData;

import java.time.LocalDate;

public class BookingSearchRequest {
    private LocalDate arrival;
    private LocalDate departure;
    private double latitude;
    private double longitude;

    public BookingSearchRequest(LocalDate arrival, LocalDate departure, double latitude, double longitude) {
        this.arrival = arrival;
        this.departure = departure;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public BookingSearchData toDto(){
        return null;
    }
}
