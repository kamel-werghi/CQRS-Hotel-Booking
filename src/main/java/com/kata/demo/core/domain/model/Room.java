package com.kata.demo.core.domain.model;

import java.time.LocalDate;
import java.util.List;

public class Room {
    private String name;
    private List<Booking> bookings;
    private Long version;

    public Room() {
    }

    public Room(String name) {
        this.name = name;
    }

    public Room(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public boolean isRoomAvailable(LocalDate arrivalDate, LocalDate departureDate){
        return bookings.stream().noneMatch(booking -> booking.conflictWith(arrivalDate, departureDate));
    }
}
