package com.training.booking.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * UserEntity
 */
@Entity
@Inheritance(
    strategy = InheritanceType.SINGLE_TABLE
)
@DiscriminatorColumn(name="user_type")
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String password;

    public User() {
        super();
    }

    public User(String name, String email, String password) {
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
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