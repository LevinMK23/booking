package com.acid.booking.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
    private int id;
    private String name;
    private String surname;
    private String birthDate;
    private String login;
    private String password;
}
