package com.UserMicroService.UserMicroService.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
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
    private byte[] image;
}
