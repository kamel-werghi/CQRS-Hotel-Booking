package com.kata.demo.core.infrastructure.mongodb.projector;

import com.kata.demo.core.domain.coreapi.event.HotelRoomBookedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class BookingEventHandler {

    @EventListener
    @Transactional
    public void on(HotelRoomBookedEvent event){

    }
}
