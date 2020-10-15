package com.acid.booking.services;

import java.util.List;

import com.acid.booking.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getUsersList() {
        return userDao.getUsersList();
    }

    @Override
    public void addNewUser(User user) {
        userDao.addNewUser(user);
    }
}
