package com.syed.dev.makersharks.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetUserDTO {
    private Integer id;

    private String username;

    private String email;

    private String city;

    private String country;
}
