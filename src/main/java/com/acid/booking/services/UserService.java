package com.acid.booking.services;

import java.util.List;

import com.acid.booking.model.User;
import org.springframework.stereotype.Component;

public interface UserService {

    User getUserById(int id);

    List<User> getUsersList();

    void addNewUser(User user);

}
