package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.CountryDto;
import com.xworkz.countryapp.dto.InstituteDto;
import com.xworkz.countryapp.entity.CountryEntity;
import com.xworkz.countryapp.entity.InstituteEntity;
import com.xworkz.countryapp.repository.InstituteRepositoryImpl;
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
public class InstituteServiceImpl implements InstituteService
{

    @Autowired
    InstituteRepositoryImpl instituteRepository;
    @Override
    public Boolean validateAndSave(InstituteDto instituteDto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<InstituteDto>> validate = validator.validate(instituteDto);
        boolean isSaved = false;
        if (validate.isEmpty()) {
            InstituteEntity instituteEntity = new InstituteEntity();
            try {
                BeanUtils.copyProperties(instituteDto, instituteEntity);
                instituteRepository.save(instituteEntity);
                isSaved = true;
                System.out.println(instituteEntity);
            } catch (BeansException e) {
                System.out.println(e.getMessage());
            }
        } else {
            validate.stream().forEach(error -> System.out.println(error.getMessage()));
        }
        return isSaved;
    }
    }

