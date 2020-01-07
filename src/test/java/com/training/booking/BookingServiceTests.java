package com.training.booking;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import com.training.booking.entities.Booking;
import com.training.booking.entities.enums.Slot;
import com.training.booking.entities.enums.Status;
import com.training.booking.services.BookingService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.mock.mockito.MockBean;

/**
 * BookingServiceTest
 */
@SpringBootTest
public class BookingServiceTests {

    @Autowired
    private BookingService bookingService;

    @Test
    void getAllBookings(){
        Booking bookingSample = new Booking("Very good", Status.COMPLETED, Slot.MORNING);
        bookingService.save(bookingSample);

        List<Booking> bookingList = bookingService.findAll();
        Booking lastbooking = bookingList.get(bookingList.size()-1);

        assertEquals(bookingSample.getDesc(), lastbooking.getDesc());
        assertEquals(bookingSample.getStatus(), lastbooking.getStatus());
        assertEquals(bookingSample.getId(), lastbooking.getId());
    }
    
}