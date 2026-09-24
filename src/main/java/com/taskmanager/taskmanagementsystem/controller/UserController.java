package com.taskmanager.taskmanagementsystem.controller;

import com.taskmanager.taskmanagementsystem.entity.User;
import com.taskmanager.taskmanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {

        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody User user) {

        User loggedInUser =
                userService.loginUser(user.getEmail(),user.getPassword());

        if(loggedInUser != null) {
            return "Login Successful";
        }

        return "Invalid Email or Password";
    }
}