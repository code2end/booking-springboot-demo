package com.training.booking.controllers;

import java.util.*;

import com.training.booking.services.BookingService;
import com.training.booking.entities.Booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BookingController
 */
@RestController
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/all_bookings")
    ResponseEntity<List<Booking>> getAllBookings() {
        return new ResponseEntity<>(bookingService.findAll(), HttpStatus.OK);
    }
}