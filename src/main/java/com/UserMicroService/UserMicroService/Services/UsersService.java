package com.UserMicroService.UserMicroService.Services;

import com.UserMicroService.UserMicroService.DAO.UserRequest;
import com.UserMicroService.UserMicroService.Models.Users;
import com.UserMicroService.UserMicroService.Repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final UsersRepository usersRepository;
    public Users createUser(UserRequest userRequest) {
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
