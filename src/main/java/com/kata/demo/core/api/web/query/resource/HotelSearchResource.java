package com.kata.demo.core.api.web.query.resource;

import com.kata.demo.core.api.web.query.mapper.WebHotelMapper;
import com.kata.demo.core.api.web.query.model.WebHotel;
import com.kata.demo.core.api.web.query.model.request.BookingSearchRequest;
import com.kata.demo.core.domain.port.api.HotelSearchRequester;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController(value = "/web/query")
public class HotelSearchResource {
    private final HotelSearchRequester hotelSearchRequester;

    public HotelSearchResource(HotelSearchRequester hotelSearchRequester) {
        this.hotelSearchRequester = hotelSearchRequester;
    }

    @GetMapping(value = "/room")
    public List<WebHotel> searchRoom(@RequestParam BookingSearchRequest bookingSearchRequest){
        return WebHotelMapper.mapHotels(hotelSearchRequester.getAvailableRooms(bookingSearchRequest.toDto()));
    }
}
