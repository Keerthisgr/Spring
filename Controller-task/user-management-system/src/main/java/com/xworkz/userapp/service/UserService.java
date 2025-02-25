package com.xworkz.userapp.service;

import com.xworkz.userapp.dto.UserDto;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface UserService {
    boolean  validateAndUser(UserDto dto) throws InvocationTargetException, IllegalAccessException;

    List<UserDto> getAllUsers() throws InvocationTargetException, IllegalAccessException;

    void deleteUserById(int i);
}
