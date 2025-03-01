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

    @Override
    public UserDto getUserById(int id) {
        UserDto userDto = new UserDto();
        UserEntity userEntity = repo.fetchUserById(id);
        try{
            BeanUtils.copyProperties(userDto,userEntity);
        }catch(IllegalAccessException e){
            throw new RuntimeException(e);
        }catch (InvocationTargetException e){
            throw new RuntimeException(e);
        }
        return userDto;
    }

    @Override
    public boolean updateUser(UserDto dto) {
        boolean isUserUpdated = false;
        UserEntity userEntity = new UserEntity();
        if (dto != null) {
            try {
                BeanUtils.copyProperties(userEntity, dto);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        isUserUpdated = repo.updateUser(userEntity);
        return isUserUpdated;
    }

}
