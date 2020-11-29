package com.acid.booking.controllers;

import com.acid.booking.model.User;
import com.acid.booking.services.UserService;
import com.acid.booking.services.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/users")
public class UserController {

    Logger log = LoggerFactory.getLogger(UserController.class);

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    Object getUserInfo(@PathVariable int id) {
        return new ModelAndView("lk")
                .addObject("user", userService.findById(id)
                        .orElse(new User()));
    }

    @CrossOrigin
    @GetMapping
    Object getUsers(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String surname) {
        if (name != null && surname != null) {
            return userService.findByNameAndSurname(name, surname)
                    .orElse(null);
        }
        return new ModelAndView("users")
                .addObject("userList", userService.findAll());
    }

    @PostMapping("/reg")
    User register(@RequestBody User user) {
        return userService.save(user);
    }

}
