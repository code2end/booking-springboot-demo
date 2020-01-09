package com.training.booking;

import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.training.booking.entities.User;
import com.training.booking.models.UserDTO;
import com.training.booking.services.UserService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


/**
 * BookingControllerTests
 */
@ExtendWith (SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTests {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    void addUser() throws Exception {
        UserDTO userDTO = new UserDTO("john@ongrid.in", "pass");
        User user = new User("John", "john@ongrid.in", "pass");
        when(userService.saveCandidate(userDTO)).thenReturn(user);

        ObjectMapper objectMapper = new ObjectMapper();
        String userJSON = objectMapper.writeValueAsString(user);

        ResultActions result = mockMvc.perform(MockMvcRequestBuilders.post("/add_user")
            .contentType(MediaType.APPLICATION_JSON)
            .content(userJSON)
        );

        result.andExpect(status().isCreated())
        .andExpect(jsonPath("$.name").value("John"))
        .andExpect(jsonPath("$.email").value("john@ongrid.in"));
    }
}