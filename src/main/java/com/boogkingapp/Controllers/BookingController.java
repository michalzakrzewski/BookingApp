package com.boogkingapp.Controllers;

import com.boogkingapp.Model.HotelBooking;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {
    private List<HotelBooking> hotelBookingList;

    public BookingController() {
        this.hotelBookingList = new ArrayList<>();

        hotelBookingList.add(new HotelBooking("Orbis", 200, 3));
        hotelBookingList.add(new HotelBooking("Neptun", 150, 6));
        hotelBookingList.add(new HotelBooking("PZM", 90, 7));
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<HotelBooking> getAll(){
        return hotelBookingList;
    }

    @RequestMapping(value = "/affordable/{price}", method = RequestMethod.GET)
    public List<HotelBooking> getAffordable(@PathVariable double price){
        return hotelBookingList.stream().filter(x -> x.getPricePerNight() <= price).collect(Collectors.toList());

    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<HotelBooking> create(@RequestBody HotelBooking hotelBooking){
        hotelBookingList.add(hotelBooking);
        return hotelBookingList;
    }
    
}
