package com.training.booking;

import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;

import com.training.booking.entities.Booking;
import com.training.booking.entities.enums.Slot;
import com.training.booking.entities.enums.Status;
import com.training.booking.services.BookingService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


/**
 * BookingControllerTests
 */
@ExtendWith (SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class BookingControllerTests {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private BookingService bookingService;

    @Test
    void getAllBookings() throws Exception {
        List<Booking> bookingList = new ArrayList<Booking>();
        bookingList.add(new Booking("Very good", Status.COMPLETED, Slot.MORNING));
        bookingList.add(new Booking("Confirmed", Status.BOOKED, Slot.EVENING));
        when(bookingService.findAll()).thenReturn(bookingList);

        mockMvc.perform(MockMvcRequestBuilders.get("/all_bookings")
                .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(jsonPath("$", hasSize(2))).andDo(print());
    }
}