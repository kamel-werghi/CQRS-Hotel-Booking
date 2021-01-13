package com.kata.demo.core.domain.model;

import java.time.LocalDate;
import java.util.List;

public class Room {
    private String name;
    private List<Booking> bookings;
    private Long version;

    public Room(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public boolean isRoomAvailable(LocalDate arrivalDate, LocalDate departureDate){
        return false;
    }
}
