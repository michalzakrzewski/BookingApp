package com.boogkingapp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HotelBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;


    private String hotelName;
    private double pricePerNight;
    private int numberOfNights;
    private double TotalPrice;

    public HotelBooking() {
    }

    public HotelBooking(String hotelName, double pricePerNight, int numberOfNights, double TotalPrice) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.numberOfNights = numberOfNights;
        this.TotalPrice = TotalPrice;
    }

    public String getHotelName() {
        return hotelName;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public double getTotalPrice(){
        return pricePerNight * numberOfNights;
    }

    public long getId() {
        return id;
    }
}
