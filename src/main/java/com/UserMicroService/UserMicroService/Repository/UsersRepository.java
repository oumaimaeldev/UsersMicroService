package com.UserMicroService.UserMicroService.Repository;

import com.UserMicroService.UserMicroService.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository <Users, Long > {

    //boolean existsByEmail(String Email);
}
