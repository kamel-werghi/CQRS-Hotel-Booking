package com.kata.demo.core.api.web.command.model.request;

import com.kata.demo.core.domain.dto.BookingData;

import java.time.LocalDate;

public class BookingRequest {
    private String hotelId;
    private String roomId;
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    private Long targetVersion;

    public BookingData toModel(){
        return null;
    }
}
