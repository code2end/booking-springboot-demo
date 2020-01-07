package com.training.booking.entities;

import javax.persistence.Entity;

/**
 * Coach
 */
@Entity
public class Coach extends User {

    private double rating;

    public Coach(String name, String email, String password) {
        super(name, email, password);
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}