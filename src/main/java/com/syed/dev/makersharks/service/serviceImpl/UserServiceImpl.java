package com.syed.dev.makersharks.service.serviceImpl;

import com.syed.dev.makersharks.dto.GetUserDTO;
import com.syed.dev.makersharks.entity.UserEntity;
import com.syed.dev.makersharks.exceptionHandler.ValidationException;
import com.syed.dev.makersharks.repository.UserRepository;
import com.syed.dev.makersharks.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserEntity registerUser(UserEntity user) {
        if (user.getUsername() == null) {
            throw new ValidationException("username cannot be null");
        }
        if (user.getEmail() == null) {
            throw new ValidationException("email cannot be null");
        }
        if (user.getPasswords() == null) {
            throw new ValidationException("password cannot be null");
        }

        return userRepository.save(user);
    }

    @Override
    public GetUserDTO getUserDetails(String username) {
        UserEntity userEntity = userRepository.findByUsername(username);
        GetUserDTO userDTO = new GetUserDTO();
        userDTO.setId(userEntity.getId());
        userDTO.setUsername(userEntity.getUsername());
        userDTO.setEmail(userEntity.getEmail());
        userDTO.setCity(userEntity.getCity());
        userDTO.setCountry(userEntity.getCountry());
        return userDTO;
    }
}
