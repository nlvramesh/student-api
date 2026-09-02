package com.example.studentapi.controller;

import com.example.studentapi.model.User;
import com.example.studentapi.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {

        return userService.registerUser(user);
    }
}
