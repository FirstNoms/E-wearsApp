package com.africa.ewearsapp.services;

import com.africa.ewearsapp.data.dtos.request.RegisterUserRequest;
import com.africa.ewearsapp.data.dtos.response.GetUserInfoResponse;
import com.africa.ewearsapp.data.dtos.response.GetUserResponse;
import com.africa.ewearsapp.data.dtos.response.RegisterUserResponse;

public interface UserService {
    String createUser(RegisterUserRequest request);

    GetUserResponse getUserByUsername(String username);

    GetUserResponse getUserByUserId(String userId);

    GetUserInfoResponse getUserInfo();
}
