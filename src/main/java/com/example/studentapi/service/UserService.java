package com.example.studentapi.service;

import com.example.studentapi.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String registerUser(User user) {

        return "User registered successfully: " + user.getName();
    }
}