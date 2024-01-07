package com.UserMicroService.UserMicroService.DAO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    @Column(unique = true)
    @NotBlank(message="CIN cannot be empty")
    @Pattern(regexp = "^[a-zA-Z]{2}\\d{5}$", message = "CIN non valid")
    private String CIN;
    @NotBlank(message="First name cannot be empty")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "First name should contain only letters")
    private String Firstname;
    @NotBlank(message="Last name cannot be empty")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "First name should contain only letters")
    private String Lastname;
    @NotBlank(message="Address cannot be empty")
    private String Address;
    @NotBlank(message="please select role")
    private String Role;
    @NotBlank(message="Email cannot be empty")
    @jakarta.validation.constraints.Email
    private String Email;
    @NotBlank(message="Password cannot be empty")
    private String Password;
    @Pattern(regexp = "^\\+212\\d{9}$",message = "Invalid phone number")
    private String Phone;
    @NotBlank(message="please select City")
    private String City;



}
