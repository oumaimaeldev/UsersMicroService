package com.UserMicroService.UserMicroService.Repository;

import com.UserMicroService.UserMicroService.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsersRepository extends JpaRepository <Users, Long > {
    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM Users u WHERE u.Email = :Email")
    boolean existsByEmail(@Param("Email") String Email);
}
