package com.UserMicroService.UserMicroService.Services;

import com.UserMicroService.UserMicroService.DAO.UserRequest;
import com.UserMicroService.UserMicroService.Exception.EmailAlreadyExistsException;
import com.UserMicroService.UserMicroService.Exception.UserNotFoundException;
import com.UserMicroService.UserMicroService.Models.Users;
import com.UserMicroService.UserMicroService.Repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Users createUser(UserRequest userRequest) {
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

    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    public Users getUserById(Long id) {
        Optional<Users> userOptional = usersRepository.findById(id);
        return userOptional.orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
    }

    public Users updateUser(Long id, UserRequest updatedUser) {
        Users existingUser = getUserById(id);
        existingUser.setFirstname(updatedUser.getFirstname());
        existingUser.setLastname(updatedUser.getLastname());
        existingUser.setAddress(updatedUser.getAddress());
        existingUser.setRole(updatedUser.getRole());
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setPassword(updatedUser.getPassword());
        existingUser.setPhone(updatedUser.getPhone());
        existingUser.setCity(updatedUser.getCity());
        return usersRepository.save(existingUser);
    }
}
