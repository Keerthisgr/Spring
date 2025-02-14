package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.LaptopDto;
import com.xworkz.countryapp.dto.TrainDto;
import com.xworkz.countryapp.entity.LaptopEntity;
import com.xworkz.countryapp.entity.TrainEntity;
import com.xworkz.countryapp.repository.TrainRepositoryImpl;
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
public class TrainServiceImpl implements TrainService{

    @Autowired
    TrainRepositoryImpl repository;
    @Override
    public Boolean validateAndSave(TrainDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<TrainDto>> validate = validator.validate(dto);
        boolean isSaved = false;
        if (validate.isEmpty()) {
            TrainEntity entity = new TrainEntity();
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
