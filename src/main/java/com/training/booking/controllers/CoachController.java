package com.training.booking.controllers;

import java.security.Principal;
import java.sql.SQLException;

import com.training.booking.entities.CoachSlots;
import com.training.booking.entities.User;
import com.training.booking.models.SlotDTO;
import com.training.booking.models.UserDTO;
import com.training.booking.services.CoachSlotService;
import com.training.booking.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * CoachController
 */
@RestController
public class CoachController {

    @Autowired
    private CoachSlotService coachSlotService;

    @Autowired
    private UserService userService;

    @PostMapping("/coach/register")
    public ResponseEntity<User> saveCoach(@RequestBody UserDTO user) throws Exception {
        return ResponseEntity.ok(saveUser(user));
    }

    @PostMapping("/coach/add_slot")
    ResponseEntity<CoachSlots> addSlot(@RequestBody SlotDTO slot, Principal principal) throws Exception {
        String email = principal.getName();
        User user = userService.getUserByEmail(email);
        return new ResponseEntity<>(saveSlot(slot, user.getId()), HttpStatus.CREATED);
    }

    private CoachSlots saveSlot(SlotDTO slot, int uId) throws Exception {
        try {
            return coachSlotService.save(slot, uId);
        } catch (SQLException e) {
            throw new Exception("SQL ERROR", e);
        }catch (DataIntegrityViolationException e) {
            throw new Exception("Entry already exist for this slot", e);
        }
    }

    private User saveUser(UserDTO user) throws Exception {
        try {
            return userService.saveCoach(user);
        } catch (SQLException e) {
            throw new Exception("SQL ERROR", e);
        }catch (DataIntegrityViolationException e) {
            throw new Exception("User Already Exist", e);
        }
    }

    // TODO : Update Slot
    // TODO : Delete Slot

}