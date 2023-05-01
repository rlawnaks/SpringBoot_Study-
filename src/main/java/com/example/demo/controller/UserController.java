package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private final UserService userService;

    @PostMapping(value = "/register")
    public User register(@RequestBody User user) {
        return userService.save(user);
    }

    @PostMapping(value = "/login")
    public boolean login(@RequestBody User user) {
        return userService.login(user);
    }

}
