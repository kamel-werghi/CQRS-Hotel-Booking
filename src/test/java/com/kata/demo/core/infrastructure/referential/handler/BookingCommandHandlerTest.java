package com.kata.demo.core.infrastructure.referential.handler;

import com.kata.demo.core.domain.coreapi.command.BookHotelRoomCommand;
import com.kata.demo.core.domain.coreapi.event.RoomNotFoundEvent;
import com.kata.demo.core.domain.coreapi.event.RoomVersionMismatchEvent;
import com.kata.demo.core.domain.dto.BookingData;
import com.kata.demo.core.domain.model.Booking;
import com.kata.demo.core.domain.port.infrastructure.EventGateway;
import com.kata.demo.core.infrastructure.gateway.EventGatewayAdapter;
import com.kata.demo.core.infrastructure.referential.model.MSRoom;
import com.kata.demo.core.infrastructure.referential.repository.RoomRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class BookingCommandHandlerTest {

    @Mock
    private RoomRepository roomRepository;

    @Mock
    private EventGateway eventGateway;

    @InjectMocks
    private BookingCommandHandler bookingCommandHandler;

    @Test
    public void shouldSendRoomNotFoundEvent_WhenRoomNotFound(){
        // Given
        when(roomRepository.findById("101")).thenReturn(Optional.empty());
        BookHotelRoomCommand command = new BookHotelRoomCommand(new Booking(new BookingData()));
        doNothing().when(eventGateway).publish(any(RoomNotFoundEvent.class));

        // When
        bookingCommandHandler.handle(command);

        // Then
        verify(eventGateway, times(1)).publish(any(RoomNotFoundEvent.class));
    }

    @Test
    public void shouldSendRoomVersionMismatchEvent_WhenRoomVersionIsDifferentThanTargetVersion(){
        // Given
        Long targetVersion = 1L;
        Long actualVersion = 2L;
        String roomId = "101";
        BookHotelRoomCommand command = BookHotelRoomCommand.create(new BookingData(roomId, targetVersion));
        when(roomRepository.findById(roomId)).thenReturn(Optional.of(new MSRoom(actualVersion)));
        doNothing().when(eventGateway).publish(any(RoomVersionMismatchEvent.class));

        // When
        bookingCommandHandler.handle(command);

        // Then
        verify(eventGateway, times(1)).publish(any(RoomVersionMismatchEvent.class));
    }
}
