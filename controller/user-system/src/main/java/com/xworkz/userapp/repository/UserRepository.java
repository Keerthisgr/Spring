package com.xworkz.userapp.repository;

import com.xworkz.userapp.entity.UserEntity;

public interface UserRepository {
    Boolean saveUser(UserEntity entity);
}
