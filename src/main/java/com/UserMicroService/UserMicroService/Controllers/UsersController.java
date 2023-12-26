package com.UserMicroService.UserMicroService.Controllers;

import com.UserMicroService.UserMicroService.DAO.UserRequest;
import com.UserMicroService.UserMicroService.Models.Users;
import com.UserMicroService.UserMicroService.Services.UsersService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UsersController {
    private final UsersService usersService;
    @PostMapping("/addUsers")
    public ResponseEntity<Users> createUser(@RequestBody @Valid UserRequest userRequest){
        System.out.println("Raw Request Body: " + userRequest);
        Users createdUser = usersService.createUser(userRequest);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }


}
