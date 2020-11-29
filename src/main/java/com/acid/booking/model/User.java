package com.acid.booking.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    private int id;

    private String name;

    private String surname;

    private Date birthDate;

    private boolean auth;

    public User() {

    }
}
