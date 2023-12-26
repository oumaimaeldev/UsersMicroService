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
    private Long Id;
    private String Firstname;
    private String Lastname;
    private String Address;
    private String Role;
    private String Email;
    private String Password;
    private String Phone;
    private String City;
    private byte[] image;
}
