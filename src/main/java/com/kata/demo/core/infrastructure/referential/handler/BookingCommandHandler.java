package com.kata.demo.core.infrastructure.referential.handler;

import com.kata.demo.core.domain.coreapi.command.BookHotelRoomCommand;
import com.kata.demo.core.infrastructure.referential.adapter.RoomAdapter;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class BookingCommandHandler {
    private final RoomAdapter roomAdapter;

    public BookingCommandHandler(RoomAdapter roomAdapter) {
        this.roomAdapter = roomAdapter;

    }

    @EventListener
    @Transactional
    public void handle(BookHotelRoomCommand command){
    }
}
