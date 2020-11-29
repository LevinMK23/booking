package com.acid.booking.services;

import java.util.List;
import java.util.Optional;

import com.acid.booking.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public interface UserService {

    Optional<User> findById(int id);

    Iterable<User> findAll();

    Optional<User> findByNameAndSurname(String name, String surname);

    User save(User user);

}
