package com.africa.ewearsapp.data.repository;

import com.africa.ewearsapp.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUserName(String username);

    //Optional<User> findByEmail(String email);

   // Optional<User> findByUserId(String userId);

    Boolean existsByUserName(String username);

    Boolean existsByEmailAddress(String emailaddress);
}
