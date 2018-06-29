package com.boogkingapp;

import com.boogkingapp.Model.HotelBooking;
import com.boogkingapp.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    private BookingRepository bookingRepository;

    @Autowired
    public DatabaseSeeder(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<HotelBooking> hotelBookingList = new ArrayList<>();

        hotelBookingList.add(new HotelBooking("Orbis", 200, 3));
        hotelBookingList.add(new HotelBooking("Neptun", 150, 6));
        hotelBookingList.add(new HotelBooking("PZM", 90, 7));

        bookingRepository.saveAll(hotelBookingList);
    }
}
