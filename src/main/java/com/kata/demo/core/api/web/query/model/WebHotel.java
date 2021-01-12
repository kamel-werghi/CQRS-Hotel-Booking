package com.kata.demo.core.api.web.query.model;

import com.kata.demo.core.domain.model.Hotel;

import java.util.List;

public class WebHotel {
    private String id;
    private String name;
    private List<WebRoom> rooms;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<WebRoom> getRooms() {
        return rooms;
    }

    public static WebHotel fromModel(Hotel hotel){
        return null;
    }
}
