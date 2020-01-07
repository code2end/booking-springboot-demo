package com.training.booking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * UserEntity
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String password;
    private String authToken;
    private double level;

    public User() {
        super();
    }

    public User(String name, String email, String password) {
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
        this.setLevel(0.0);
    }

    public User(String name, String email, String password, double level) {
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
        this.setLevel(level);
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}