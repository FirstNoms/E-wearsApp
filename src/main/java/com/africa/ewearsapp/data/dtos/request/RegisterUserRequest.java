package com.africa.ewearsapp.data.dtos.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterUserRequest{

    private Long userId;

    @NotBlank
    @Size(max= 50)
    private String firstName;

    @NotBlank
    @Size(max= 50)
    private String lastName;

    @NotBlank
    private String userEmail;

    @NotBlank
    @Size(min= 6, max= 10)
    private String userName;

    @NotBlank
    @Size(min= 6, max= 15)
    private String password;
}
