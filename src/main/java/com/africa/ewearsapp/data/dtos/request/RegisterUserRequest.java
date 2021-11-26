package com.africa.ewearsapp.data.dtos.request;


import lombok.Data;

@Data
public class RegisterUserRequest{

    private Long userId;
    private String firstName;
    private String lastName;
    private String userEmail;
    private String password;

}
