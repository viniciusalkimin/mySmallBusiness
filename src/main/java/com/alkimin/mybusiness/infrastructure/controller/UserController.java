package com.alkimin.mybusiness.infrastructure.controller;

import com.alkimin.mybusiness.application.service.UserService;
import com.alkimin.mybusiness.infrastructure.dto.RegisterUserData;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @PostMapping
    public ResponseEntity<String> register(@RequestBody RegisterUserData userData){
        return ResponseEntity.ok().body(userService.create(userData));
    }
}
