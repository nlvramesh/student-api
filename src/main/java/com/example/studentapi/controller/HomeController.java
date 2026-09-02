package com.example.studentapi.controller;

import com.example.studentapi.model.User;
import com.example.studentapi.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    /*@RestController
    @RequestMapping("/users")
    public static class UserController {

        private final UserService userService;

        public UserController(UserService userService) {
            this.userService = userService;
        }

        @PostMapping("/register")
        public String register(@RequestBody User user) {

            return userService.registerUser(user);
        }
    }*/
}