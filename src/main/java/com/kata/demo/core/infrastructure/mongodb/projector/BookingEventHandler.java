package com.kata.demo.core.infrastructure.mongodb.projector;

import com.kata.demo.core.domain.coreapi.event.HotelRoomBookedEvent;
import com.kata.demo.core.domain.port.infrastructure.EventGateway;
import com.kata.demo.core.infrastructure.mongodb.adapter.HotelAdapter;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class BookingEventHandler {
    private final HotelAdapter hotelAdapter;
    private final EventGateway eventGateway;

    public BookingEventHandler(HotelAdapter hotelAdapter, EventGateway eventGateway) {
        this.hotelAdapter = hotelAdapter;
        this.eventGateway = eventGateway;
    }

    @EventListener
    @Transactional
    public void on(HotelRoomBookedEvent event){
    }
}
