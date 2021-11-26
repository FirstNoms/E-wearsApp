package com.africa.ewearsapp.data.model;

import lombok.Data;

import javax.persistence.*;


@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String emailAddress;

    private Cart cart;


}
