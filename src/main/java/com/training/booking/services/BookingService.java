package com.training.booking.services;

import java.util.List;

import com.training.booking.entities.Booking;
import com.training.booking.repositories.BookingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BookingService
 */
@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public List<Booking> findAll() {
        return this.bookingRepository.findAll();
    }

    public void save(Booking booking) {
        this.bookingRepository.saveAndFlush(booking);
    }
    
}