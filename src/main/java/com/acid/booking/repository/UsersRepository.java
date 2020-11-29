package com.acid.booking.repository;

import com.acid.booking.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends CrudRepository<User, Integer> {

    Optional<User> findUserByNameAndSurname(String name, String surname);
}
