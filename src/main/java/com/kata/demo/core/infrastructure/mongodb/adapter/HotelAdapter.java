package com.kata.demo.core.infrastructure.mongodb.adapter;

import com.kata.demo.core.domain.model.Coordinates;
import com.kata.demo.core.domain.model.Hotel;
import com.kata.demo.core.domain.port.infrastructure.HotelDataGateway;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelAdapter implements HotelDataGateway {
    @Override
    public List<Hotel> getHotelsWithin(Coordinates location) {
        return null;
    }
}
