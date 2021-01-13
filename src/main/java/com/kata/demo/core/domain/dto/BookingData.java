package com.kata.demo.core.domain.dto;

import java.time.LocalDate;

public class BookingData {
    private String hotelId;
    private String roomId;
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    private Long targetVersion;

    public BookingData() {
    }

    public BookingData(String hotelId, String roomId, LocalDate arrivalDate, LocalDate departureDate, Long targetVersion) {
        this.hotelId = hotelId;
        this.roomId = roomId;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.targetVersion = targetVersion;
    }
}
