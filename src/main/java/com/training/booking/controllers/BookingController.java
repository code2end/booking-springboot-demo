package com.training.booking.controllers;

import java.util.*;

import com.training.booking.services.BookingService;
import com.training.booking.services.CoachSlotService;
import com.training.booking.entities.Booking;
import com.training.booking.entities.CoachSlots;
import com.training.booking.models.SlotDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * BookingController
 */
@RestController
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private CoachSlotService coachSlotService;

    @GetMapping("/get_bookings")
    ResponseEntity<List<Booking>> getAllBookings() {
        return new ResponseEntity<>(bookingService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/get_booking_slots")
    public ResponseEntity<List<CoachSlots>> getCoachSlots(@RequestBody SlotDTO slot) throws Exception {
        return ResponseEntity.ok(coachSlotService.getBookingSlots(slot));
    }

    // TODO : Create new booking
    // TODO : Change Booking Status (Accepted, Rejected , Cancelled)
    // TODO : Get Bookings by specified filter (by user_id)

}