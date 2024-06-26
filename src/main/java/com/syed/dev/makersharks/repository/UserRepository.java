package com.syed.dev.makersharks.repository;

import com.syed.dev.makersharks.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {

    public UserEntity findByUsername(String username);
}
