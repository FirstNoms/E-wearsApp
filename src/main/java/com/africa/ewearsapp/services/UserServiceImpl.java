package com.africa.ewearsapp.services;

import com.africa.ewearsapp.data.dtos.request.RegisterUserRequest;
import com.africa.ewearsapp.data.dtos.response.GetUserInfoResponse;
import com.africa.ewearsapp.data.dtos.response.GetUserResponse;
import com.africa.ewearsapp.data.exception.DuplicateEmailException;
import com.africa.ewearsapp.data.exception.RuntimeExceptionDecline;
import com.africa.ewearsapp.data.model.User;
import com.africa.ewearsapp.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    BCryptPasswordEncoder passwordEncoder;

    @Override
    public String createUser(RegisterUserRequest request) {
        String encodedPassword = passwordEncoder.encode(request.getPassword());
        if(userRepository.existsByUsername(request.getUserName())){
            throw new RuntimeExceptionDecline("This Username already exist!");
        }
        if(userRepository.existsByEmail(request.getUserEmail())){
            throw new DuplicateEmailException("This Email already exist!");
        }
        User user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .userName(request.getUserName())
                .emailAddress(request.getUserEmail())
                .password(request.getPassword())
                .build();
        User savedUser = userRepository.save(user);
        return savedUser.toString();
    }

    @Override
    public GetUserResponse getUserByUsername(String username) {
        return null;
    }

    @Override
    public GetUserResponse getUserByUserId(String userId) {
        return null;
    }

    @Override
    public GetUserInfoResponse getUserInfo() {
        return null;
    }
}
