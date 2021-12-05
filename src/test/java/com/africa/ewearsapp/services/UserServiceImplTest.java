package com.africa.ewearsapp.services;

import com.africa.ewearsapp.data.dtos.request.RegisterUserRequest;
import com.africa.ewearsapp.data.model.User;
import com.africa.ewearsapp.data.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {
    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @Test
    void createUser() {
        RegisterUserRequest request = RegisterUserRequest.builder()
                .firstName("chinomso")
                .lastName("goodnews")
                .userName("firstNoms")
                .userEmail("firstnoms.gmail.com")
                .password("456Ugc@@@")
                .build();
        assertNotNull(userService.createUser(request));
    }
}