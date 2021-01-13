package com.kata.demo.core.infrastructure.mongodb.model;


import com.kata.demo.core.domain.model.Room;

import java.util.List;

public class MGRoom {
    private String id;
    private String name;
    private List<MGBooking> bookings;
    private Long version;

    public Room toModel(){
        return new Room(name);
    }

    public String getId() {
        return id;
    }

    public List<MGBooking> getBookings() {
        return bookings;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
