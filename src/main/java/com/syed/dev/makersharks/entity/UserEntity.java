package com.syed.dev.makersharks.entity;


import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "passwords")
    private String passwords;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;
}
