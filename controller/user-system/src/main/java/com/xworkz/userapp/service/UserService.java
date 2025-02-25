package com.xworkz.userapp.service;

import com.xworkz.userapp.dto.UserDto;

public interface UserService {

    Boolean validateAndSaveUser(UserDto dto);
}
