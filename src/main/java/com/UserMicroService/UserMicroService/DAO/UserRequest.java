package com.UserMicroService.UserMicroService.DAO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    private String Firstname;
    private String Lastname;
    private String Address;
    private String Role;
    private String Email;
    private String Password;
    private String Phone;
    private String City;
}
