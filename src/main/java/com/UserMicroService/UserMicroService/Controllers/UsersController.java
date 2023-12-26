package com.UserMicroService.UserMicroService.Controllers;

import com.UserMicroService.UserMicroService.DAO.UserRequest;
import com.UserMicroService.UserMicroService.Models.Users;
import com.UserMicroService.UserMicroService.Services.UsersService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UsersController {
    private final UsersService usersService;
    @PostMapping("/addUsers")
    public ResponseEntity<Users> createUser(@RequestBody @Valid UserRequest userRequest){
        Users createdUser = usersService.createUser(userRequest);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }

}
