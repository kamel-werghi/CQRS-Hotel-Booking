package com.kata.demo.core.infrastructure.mongodb.model;


import com.kata.demo.core.domain.model.Coordinates;
import com.kata.demo.core.domain.model.Hotel;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Document
public class MGHotel {
    @Id
    private String id;
    private String name;
    private Coordinates coordinates;
    private List<MGRoom> rooms;

    public MGHotel(String id, String name, Coordinates coordinates) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.rooms = new ArrayList<>();
    }

    public Hotel toModel(){
        return null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public List<MGRoom> getRooms() {
        return rooms;
    }

    public void setRooms(List<MGRoom> rooms) {
        this.rooms = rooms;
    }

}
