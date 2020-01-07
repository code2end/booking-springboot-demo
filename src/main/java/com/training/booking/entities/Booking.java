package com.training.booking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.training.booking.entities.enums.Slot;
import com.training.booking.entities.enums.Status;

/**
 * BookingEntity
 */
@Entity
public class Booking {

    @Id
    @GeneratedValue
    private int id;
    private Slot slot;
    private int candidateId;
    private int coachId;
    private String desc;
    private Status status;

    public Booking() {
        super();
    }

    public Booking(String desc, Status status, Slot slot) {
        this.setSlot(slot);
        this.setDesc(desc);
        this.setStatus(status);
    }

    public int getCoachId() {
        return coachId;
    }

    public void setCoachId(int coachId) {
        this.coachId = coachId;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}