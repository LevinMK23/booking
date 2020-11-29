package com.acid.booking.services;

import com.acid.booking.model.User;
import com.acid.booking.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UsersRepository repository;

    public UserServiceImpl(UsersRepository repository) {
        this.repository = repository;
    }

    public Optional<User> findById(int id) {
        return repository.findById(id);
    }

    public Iterable<User> findAll() {
        return repository.findAll();
    }

    public Optional<User> findByNameAndSurname(String name, String surname) {
        return repository.findUserByNameAndSurname(name, surname);
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

}
