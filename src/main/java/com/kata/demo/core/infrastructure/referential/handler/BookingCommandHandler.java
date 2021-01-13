package com.kata.demo.core.infrastructure.referential.handler;

import com.kata.demo.core.domain.coreapi.command.BookHotelRoomCommand;
import com.kata.demo.core.domain.port.infrastructure.EventGateway;
import com.kata.demo.core.infrastructure.referential.repository.RoomRepository;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class BookingCommandHandler {
    private final EventGateway eventGateway;
    private final RoomRepository roomRepository;

    public BookingCommandHandler(EventGateway eventGateway, RoomRepository roomRepository) {
        this.eventGateway = eventGateway;
        this.roomRepository = roomRepository;
    }

    @EventListener
    @Transactional
    public void handle(BookHotelRoomCommand command){
    }
}
