package com.boogkingapp.Controllers;

import com.boogkingapp.Model.HotelBooking;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookingController {
    private List<HotelBooking> hotelBookingList;

    public BookingController() {
        this.hotelBookingList = new ArrayList<>();

        hotelBookingList.add(new HotelBooking("Orbis", 200, 3));
        hotelBookingList.add(new HotelBooking("Neptun", 150, 6));
        hotelBookingList.add(new HotelBooking("PZM", 90, 7));
    }
}
