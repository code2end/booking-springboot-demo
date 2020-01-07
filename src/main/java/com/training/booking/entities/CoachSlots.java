package com.training.booking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.training.booking.entities.enums.Day;
import com.training.booking.entities.enums.Level;
import com.training.booking.entities.enums.Slot;
import com.training.booking.entities.enums.Sport;

/**
 * CoachSlots
 */
@Entity
public class CoachSlots {

    @Id
    @GeneratedValue
    private int id;
    private int coachId;
    private Slot slot;
    private Day day;
    private Sport sport;
    private Level level;

    public CoachSlots(int _coachId, Slot _slot, Day _day, Sport _sport, Level _level) {
        super();
        this.setCoachId(_coachId);
        this.setSlot(_slot);
        this.setDay(_day);
        this.setSport(_sport);
        this.setLevel(_level);
    }

    public int getCoachId() {
        return coachId;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public void setCoachId(int coachId) {
        this.coachId = coachId;
    }
}