package com.UserMicroService.UserMicroService.Services;

import com.UserMicroService.UserMicroService.DAO.UserRequest;
import com.UserMicroService.UserMicroService.Exception.EmailAlreadyExistsException;
import com.UserMicroService.UserMicroService.Models.Users;
import com.UserMicroService.UserMicroService.Repository.UsersRepository;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Users createUser(UserRequest userRequest) {
        System.out.println("Raw Request Body: " + userRequest.getEmail());
        if (usersRepository.existsByEmail(userRequest.getEmail())) {
            throw new EmailAlreadyExistsException("Email already exists");
        }
        Users newUser = new Users();
        newUser.setFirstname(userRequest.getFirstname());
        newUser.setLastname(userRequest.getLastname());
        newUser.setAddress(userRequest.getAddress());
        newUser.setRole(userRequest.getRole());
        newUser.setEmail(userRequest.getEmail());
        newUser.setPassword(userRequest.getPassword());
        newUser.setPhone(userRequest.getPhone());
        newUser.setCity(userRequest.getCity());
        return usersRepository.save(newUser);

    }

}
