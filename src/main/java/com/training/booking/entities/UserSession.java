package com.training.booking.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * UserSession
 */
@Entity
public class UserSession {

    @Id
    @GeneratedValue
    private int id;
    private int uId;
    private String authToken;
    private LocalDateTime createdDate;

    public UserSession() {
        super();
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public UserSession(int uId) {
        super();
        this.setuId(uId);

    }

    
}