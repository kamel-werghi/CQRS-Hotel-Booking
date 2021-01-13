package com.kata.demo.core.infrastructure.referential.adapter;

import com.kata.demo.common.exception.RoomNotFoundException;
import com.kata.demo.common.exception.VersionMismatchException;
import com.kata.demo.core.domain.model.Booking;
import com.kata.demo.core.domain.model.Room;
import com.kata.demo.core.infrastructure.referential.repository.BookingRepository;
import com.kata.demo.core.infrastructure.referential.repository.RoomRepository;
import org.springframework.stereotype.Component;


@Component
public class RoomAdapter {
    private final RoomRepository roomRepository;
    private final BookingRepository bookingRepository;

    public RoomAdapter(RoomRepository roomRepository, BookingRepository bookingRepository) {
        this.roomRepository = roomRepository;
        this.bookingRepository = bookingRepository;
    }

    public Room addBooking(Booking booking) throws VersionMismatchException, RoomNotFoundException {
        return null;
    }
}
