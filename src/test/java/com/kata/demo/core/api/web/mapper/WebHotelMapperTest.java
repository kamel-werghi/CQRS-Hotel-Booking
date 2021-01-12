package com.kata.demo.core.api.web.mapper;

import com.kata.demo.core.api.web.query.mapper.WebHotelMapper;
import com.kata.demo.core.api.web.query.model.WebHotel;
import com.kata.demo.core.domain.model.Hotel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class WebHotelMapperTest {

    @Test
    public void shouldReturnsEmptyList_WhenInputListIsNull(){
        // Given
        List<Hotel> hotels = null;

        // When
        List<WebHotel> webHotels = WebHotelMapper.mapHotels(hotels);

        // Then
        assertNotNull(webHotels);
        assertEquals(webHotels.size(), 0);
    }

    @Test
    public void shouldReturnsEmptyList_WhenInputListIsEmpty(){
        // Given
        List<Hotel> hotels = new ArrayList<>();

        // When
        List<WebHotel> webHotels = WebHotelMapper.mapHotels(hotels);

        // Then
        assertNotNull(webHotels);
        assertEquals(webHotels.size(), 0);
    }

    @Test
    public void shouldReturnOnlyValidHotels_WhenInputContainsNullValues(){
        //Given
        Hotel hotel = new Hotel();
        Hotel hotel1 = null;
        WebHotel webHotel = new WebHotel();
        List<Hotel> hotels = Arrays.asList(hotel, hotel1);
        when(WebHotel.fromModel(hotel)).thenReturn(webHotel);
        when(WebHotel.fromModel(hotel1)).thenReturn(null);

        // When
        List<WebHotel> webHotels = WebHotelMapper.mapHotels(hotels);

        // Then
        assertNotNull(webHotels);
        assertEquals(webHotels.size(), 1);
        assertEquals(webHotels.get(0), webHotel);
    }

    @Test
    public void shouldReturnsMappedList_WhenInputListIsNotEmptyNorNull(){
        // Given
        Hotel hotel = new Hotel();
        WebHotel webHotel = new WebHotel();
        List<Hotel> hotels = Collections.singletonList(hotel);
        when(WebHotel.fromModel(hotel)).thenReturn(webHotel);

        // When
        List<WebHotel> webHotels = WebHotelMapper.mapHotels(hotels);

        // Then
        assertNotNull(webHotels);
        assertEquals(webHotels.size(), 1);
        assertEquals(webHotels.get(0), webHotel);
    }
}
