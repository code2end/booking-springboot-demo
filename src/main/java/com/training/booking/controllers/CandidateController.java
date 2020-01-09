package com.training.booking.controllers;

import java.sql.SQLException;

import com.training.booking.entities.User;
import com.training.booking.models.UserDTO;
import com.training.booking.services.UserService;

import org.springframework.http.ResponseEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * CandidateController
 */
@RestController
public class CandidateController {

  @Autowired
  private UserService userService;

  @PostMapping("/candidate/register")
  public ResponseEntity<User> saveCandidate(@RequestBody UserDTO user) throws Exception {
    return ResponseEntity.ok(saveUser(user));
  }

  private User saveUser(UserDTO user) throws Exception {
    try {
      return userService.saveCandidate(user);
    } catch (SQLException e) {
        throw new Exception("SQL ERROR", e);
    }
}

}