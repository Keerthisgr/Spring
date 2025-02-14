package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.InstituteDto;
import com.xworkz.countryapp.dto.TelivisionDto;
import com.xworkz.countryapp.entity.InstituteEntity;
import com.xworkz.countryapp.entity.TelivisionEntity;
import com.xworkz.countryapp.repository.TelivisionRepositoryImpl;
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
public class TelivisionServiceImpl implements TelivisionService{
    @Autowired
    TelivisionRepositoryImpl telivisionRepository;

    @Override
    public Boolean validateAndSave(TelivisionDto telivisionDto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<TelivisionDto>> validate = validator.validate(telivisionDto);
        boolean isSaved = false;
        if (validate.isEmpty()) {
            TelivisionEntity telivisionEntity = new TelivisionEntity();
            try {
                BeanUtils.copyProperties(telivisionDto, telivisionEntity);
                telivisionRepository.save(telivisionEntity);
                isSaved = true;
                System.out.println(telivisionEntity);
            } catch (BeansException e) {
                System.out.println(e.getMessage());
            }
        } else {
            validate.stream().forEach(error -> System.out.println(error.getMessage()));
        }
        return isSaved;
    }
    }

