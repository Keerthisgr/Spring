package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.InstituteDto;
import com.xworkz.countryapp.dto.LaptopDto;
import com.xworkz.countryapp.entity.InstituteEntity;
import com.xworkz.countryapp.entity.LaptopEntity;
import com.xworkz.countryapp.repository.LaptopRepositoryImpl;
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
public class LaptopServiceImpl implements LaptopService{
    @Autowired
    LaptopRepositoryImpl repository;

    @Override
    public Boolean validateAndSave(LaptopDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<LaptopDto>> validate = validator.validate(dto);
        boolean isSaved = false;
        if (validate.isEmpty()) {
            LaptopEntity entity = new LaptopEntity();
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

