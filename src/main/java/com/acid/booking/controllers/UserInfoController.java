package com.acid.booking.controllers;

import java.util.List;

import com.acid.booking.model.User;
import com.acid.booking.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    private final UserService userService;

    public UserInfoController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/userInfo")
    User getUserInfo(@RequestParam("id") int id) {
         return userService.getUserById(id);
    }

    @GetMapping("/users")
    List<User> getUsersInfo() {
        return userService.getUsersList();
    }

    @PostMapping(path = "/userInfo/post",
            produces = "application/json",
            consumes = "application/json"
    )
    void postUser(@RequestBody User user) {
        System.out.println(user);
        user.setId(1);
        userService.addNewUser(user);
    }

}
