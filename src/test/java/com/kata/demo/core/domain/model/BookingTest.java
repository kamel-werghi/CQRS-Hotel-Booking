package com.kata.demo.core.domain.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class BookingTest {

    @Test
    public void shouldReturnTrue_WhenBookingIsIncludedInTheRequestedPeriod(){
        // Given
        LocalDate requestedArrivalDate = LocalDate.of(2021, Month.JANUARY, 10);
        LocalDate requestedDepartureDate = LocalDate.of(2021, Month.JANUARY, 20);
        Booking booking = new Booking(LocalDate.of(2021, Month.JANUARY, 12),
                LocalDate.of(2021, Month.JANUARY, 18));

        // When
        boolean isConflicting = booking.conflictWith(requestedArrivalDate, requestedDepartureDate);

        // Then
        assertTrue(isConflicting);
    }

    @Test
    public void shouldReturnTrue_WhenArrivalDateIsIncludedWithinBookingPeriod(){
        // Given
        LocalDate requestedArrivalDate = LocalDate.of(2021, Month.JANUARY, 13);
        LocalDate requestedDepartureDate = LocalDate.of(2021, Month.JANUARY, 20);
        Booking booking = new Booking(LocalDate.of(2021, Month.JANUARY, 10),
                LocalDate.of(2021, Month.JANUARY, 15));

        // When
        boolean isConflicting = booking.conflictWith(requestedArrivalDate, requestedDepartureDate);

        // Then
        assertTrue(isConflicting);
    }

    @Test
    public void shouldReturnTrue_WhenDepartureDateIsIncludedWithinBookingPeriod(){
        // Given
        LocalDate requestedArrivalDate = LocalDate.of(2021, Month.JANUARY, 8);
        LocalDate requestedDepartureDate = LocalDate.of(2021, Month.JANUARY, 12);
        Booking booking = new Booking(LocalDate.of(2021, Month.JANUARY, 10),
                LocalDate.of(2021, Month.JANUARY, 15));

        // When
        boolean isConflicting = booking.conflictWith(requestedArrivalDate, requestedDepartureDate);

        // Then
        assertTrue(isConflicting);
    }

    @Test
    public void shouldReturnFalse_WhenBookingPeriodDoesNotIntersectWithRequestedPeriod(){
        // Given
        LocalDate requestedArrivalDate = LocalDate.of(2021, Month.JANUARY, 15);
        LocalDate requestedDepartureDate = LocalDate.of(2021, Month.JANUARY, 20);
        Booking booking = new Booking(LocalDate.of(2021, Month.JANUARY, 5),
                LocalDate.of(2021, Month.JANUARY, 10));

        // When
        boolean isConflicting = booking.conflictWith(requestedArrivalDate, requestedDepartureDate);

        // Then
        assertTrue(isConflicting);
    }
}
