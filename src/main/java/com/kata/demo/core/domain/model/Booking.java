package com.kata.demo.core.domain.model;

import java.time.LocalDate;

public class Booking {
    private LocalDate arrivalDate;
    private LocalDate departureDate;

    public Booking(LocalDate arrivalDate, LocalDate departureDate) {
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
    }

    public boolean conflictWith(LocalDate arrivalDate, LocalDate departureDate){
        return this.arrivalDate.isBefore(departureDate) && this.departureDate.isAfter(arrivalDate);
    }
}
