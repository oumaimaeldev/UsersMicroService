package com.UserMicroService.UserMicroService.DAO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    @NotBlank(message="First name cannot be empty")
    private String Firstname;
    @NotBlank(message="Last name cannot be empty")
    private String Lastname;
    @NotBlank(message="Address cannot be empty")
    private String Address;
    @NotBlank(message="please select role")
    private String Role;
    @NotBlank(message="Email cannot be empty")
    private String Email;
    @NotBlank(message="Password cannot be empty")
    private String Password;
    @NotBlank(message="Phone cannot be empty")
    private String Phone;
    @NotBlank(message="please select City")
    private String City;

}