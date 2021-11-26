package com.africa.ewearsapp.data.repository;

import com.africa.ewearsapp.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
