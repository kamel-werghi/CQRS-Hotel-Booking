package com.kata.demo.core.domain.model;

import java.time.LocalDate;
import java.util.List;

public class Hotel {
    private String id;
    private String name;
    private Coordinates location;
    private List<Room> rooms;

    public Hotel() {
    }

    public Hotel(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Hotel(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void filterAvailableRooms(LocalDate arrivalDate, LocalDate departureDate){
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
