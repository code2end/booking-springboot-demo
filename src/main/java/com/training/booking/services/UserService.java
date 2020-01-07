package com.training.booking.services;

import com.training.booking.entities.User;
import com.training.booking.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return this.userRepository.saveAndFlush(user);
    }
    
}