package com.training.booking.entities;

import javax.persistence.Entity;

import com.training.booking.entities.enums.Level;

/**
 * Candidate
 */
@Entity
public class Candidate extends User {

    private Level level;

    public Candidate(String name, String email, String password) {
        super(name, email, password);
    }

	public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}