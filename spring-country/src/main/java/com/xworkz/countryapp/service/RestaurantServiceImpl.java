package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.HotelDto;
import com.xworkz.countryapp.dto.LibraryDto;
import com.xworkz.countryapp.dto.RestaurantDto;
import com.xworkz.countryapp.entity.LibraryEntity;
import com.xworkz.countryapp.entity.RestaurantEntity;
import com.xworkz.countryapp.repository.RestaurantRepository;
import com.xworkz.countryapp.repository.RestaurantRepositoryImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@Component
public class RestaurantServiceImpl implements RestaurantService{
    @Autowired
    RestaurantRepositoryImpl repository;

    @Override
    public Boolean validateAndSave(RestaurantDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<RestaurantDto>> validate = validator.validate(dto);
        boolean isSaved = false;
        if (validate.isEmpty()) {
            RestaurantEntity entity = new RestaurantEntity();
            try {
                BeanUtils.copyProperties(dto, entity);
                repository.save(entity);
                isSaved = true;
                System.out.println(entity);
            } catch (BeansException e) {
                System.out.println(e.getMessage());
            }
        } else {
            validate.stream().forEach(error -> System.out.println(error.getMessage()));
        }
        return isSaved;
    }
}
