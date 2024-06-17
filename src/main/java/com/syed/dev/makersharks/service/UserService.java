package com.syed.dev.makersharks.service;

import com.syed.dev.makersharks.dto.GetUserDTO;
import com.syed.dev.makersharks.entity.UserEntity;

public interface UserService {

    public UserEntity registerUser(UserEntity user);

    public GetUserDTO getUserDetails(String username);
}
