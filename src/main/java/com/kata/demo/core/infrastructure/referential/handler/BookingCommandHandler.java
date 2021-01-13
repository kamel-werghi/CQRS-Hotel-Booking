package com.kata.demo.core.infrastructure.referential.handler;

import com.kata.demo.core.domain.coreapi.command.BookHotelRoomCommand;
import com.kata.demo.core.domain.port.infrastructure.EventGateway;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class BookingCommandHandler {
    private final EventGateway eventGateway;

    public BookingCommandHandler(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @EventListener
    @Transactional
    public void handle(BookHotelRoomCommand command){

    }
}
