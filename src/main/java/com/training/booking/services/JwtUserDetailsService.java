package com.training.booking.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.training.booking.dto.UserDTO;
import com.training.booking.entities.Candidate;
import com.training.booking.entities.Coach;
import com.training.booking.entities.User;
import com.training.booking.entities.enums.UserType;
import com.training.booking.repositories.UserRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
                new ArrayList<>());
    }

    public User save(UserDTO user) {
        User newUser = new User(user.getEmail(), user.getEmail(), bcryptEncoder.encode(user.getPassword()));
        User castedUser = this.getUserByType(user.getUserType(), newUser);
        return userRepository.saveAndFlush(castedUser);
    }

    private User getUserByType(UserType userType, User newUser) {
        switch (userType) {
            case CANDIDATE :
                return new Candidate(newUser.getName() , newUser.getEmail(), newUser.getPassword());
            case COACH :
                return new Coach(newUser.getName() , newUser.getEmail(), newUser.getPassword());
            default:
                return newUser;
        }
    }
}