package com.bookingapp;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJSONDoc
public class BookingappApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookingappApplication.class, args);
    }
}
