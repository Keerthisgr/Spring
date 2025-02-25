package com.xworkz.userapp.repository;

import com.xworkz.userapp.entity.UserEntity;

import java.util.List;

public interface UserRepository {
    boolean saveUser(UserEntity entity);

    List<UserEntity> getAllUsers();

    void deleteUserById(int id);
}
