package com.training.booking.services;

import com.training.booking.entities.Candidate;
import com.training.booking.entities.Coach;
import com.training.booking.entities.User;
import com.training.booking.models.UserDTO;
import com.training.booking.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * UserService
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    public User getUserByEmail (String email) throws Exception{
        return userRepository.findByEmail(email);
    }

    public User saveCandidate(UserDTO user) throws Exception{
        User newUser = new Candidate(user.getEmail(), user.getEmail(), bcryptEncoder.encode(user.getPassword()));
        return userRepository.saveAndFlush(newUser);
    }

    public User saveCoach(UserDTO user) throws Exception{
        User newUser = new Coach(user.getEmail(), user.getEmail(), bcryptEncoder.encode(user.getPassword()));
        return userRepository.saveAndFlush(newUser);
    }
    
}