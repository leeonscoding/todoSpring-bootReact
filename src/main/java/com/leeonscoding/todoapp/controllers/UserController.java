package com.leeonscoding.todoapp.controllers;

import com.leeonscoding.todoapp.dto.AddUserDTO;
import com.leeonscoding.todoapp.services.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    AppUserService appUserService;

    public ResponseEntity<HttpStatus> registerUser(@RequestBody AddUserDTO userDTO) {
        appUserService.addUser(userDTO);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
