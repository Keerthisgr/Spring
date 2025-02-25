package com.xworkz.userapp.service;

import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.entity.UserEntity;
import com.xworkz.userapp.repository.UserRepository;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository repo ;
    @Override
    public boolean validateAndUser(UserDto dto) throws InvocationTargetException, IllegalAccessException {
        UserEntity entity = new UserEntity();
        if(dto != null)
            BeanUtils.copyProperties(entity,dto);

        repo.saveUser(entity);

        return true;
    }

    @Override
    public List<UserDto> getAllUsers() throws InvocationTargetException, IllegalAccessException {
        List<UserDto> userDtos = new ArrayList<>();
        List<UserEntity> userEntities = repo.getAllUsers();
        for ( UserEntity  entity : userEntities){
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(userDto , entity);
            userDtos.add(userDto);
        }
        return userDtos;
    }

    @Override
    public void deleteUserById(int id) {
        repo.deleteUserById(id);
    }
}
