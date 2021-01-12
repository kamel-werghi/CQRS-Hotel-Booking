package com.kata.demo.core.domain.model;

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
}
