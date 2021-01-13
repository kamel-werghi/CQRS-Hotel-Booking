package com.kata.demo.core.api.web.command.model.request;

import com.kata.demo.common.exception.BadRequestException;
import com.kata.demo.core.domain.dto.BookingData;

import java.time.LocalDate;

public class BookingRequest {
    private String hotelId;
    private String roomId;
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    private Long targetVersion;

    public BookingRequest() {
    }

    public BookingRequest(String hotelId, String roomId, LocalDate arrivalDate, LocalDate departureDate, Long targetVersion) {
        this.hotelId = hotelId;
        this.roomId = roomId;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.targetVersion = targetVersion;
    }

    public BookingData toModel() throws BadRequestException {
        return null;
    }
}
