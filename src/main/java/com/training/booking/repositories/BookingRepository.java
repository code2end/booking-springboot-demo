package com.training.booking.repositories;

import com.training.booking.entities.Booking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * BookingRepository
 */
@Repository("bookingRepository")
public interface BookingRepository extends JpaRepository<Booking, Integer> {
}