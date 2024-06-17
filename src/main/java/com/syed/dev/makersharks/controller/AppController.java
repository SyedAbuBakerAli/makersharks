package com.syed.dev.makersharks.controller;


import com.syed.dev.makersharks.dto.GetUserDTO;
import com.syed.dev.makersharks.entity.UserEntity;
import com.syed.dev.makersharks.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AppController {

    @Autowired
    private UserService userService;


    @PostMapping("/user/register")
    public UserEntity createUser(@RequestBody UserEntity user){
        return userService.registerUser(user);
    }



    @GetMapping("/user/fetch")
    public GetUserDTO getUserDetails(@RequestParam(name = "username") String username){
        return userService.getUserDetails(username);
    }
}
