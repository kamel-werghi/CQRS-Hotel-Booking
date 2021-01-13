package com.kata.demo.core.infrastructure.mongodb.adapter;

import com.kata.demo.core.domain.model.Coordinates;
import com.kata.demo.core.domain.model.Hotel;
import com.kata.demo.core.infrastructure.elasticsearch.repository.ESHotelRepository;
import com.kata.demo.core.infrastructure.mongodb.model.MGHotel;
import com.kata.demo.core.infrastructure.mongodb.repository.MGHotelRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class HotelAdapterTest {

    @Mock
    private MGHotelRepository mgHotelRepository;

    @Mock
    private ESHotelRepository esHotelRepository;

    @InjectMocks
    private HotelAdapter hotelAdapter;

    @Test
    public void shouldReturnsMappedHotel(){
        // Given
        Coordinates location = new Coordinates(10D, 15D);
        MGHotel mgHotel = mock(MGHotel.class);
        Hotel hotel = new Hotel();
        when(mgHotel.toModel()).thenReturn(hotel);
        when(esHotelRepository.searchWithin(any(), any(), any())).thenReturn(Collections.singletonList("2"));
        when(mgHotelRepository.findAllById(Collections.singletonList("2"))).thenReturn(Collections.singletonList(mgHotel));

        // When
        List<Hotel> hotels = hotelAdapter.getHotelsWithin(location);

        // Then
        assertEquals(hotels.size(), 1);
        assertEquals(hotels.get(0), hotel);
    }
}
