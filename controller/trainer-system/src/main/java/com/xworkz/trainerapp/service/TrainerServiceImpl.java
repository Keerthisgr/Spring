package com.xworkz.trainerapp.service;

import com.xworkz.trainerapp.dto.TrainerDto;
import com.xworkz.trainerapp.entity.TrainerEntity;
import com.xworkz.trainerapp.repository.TrainerRepository;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

@Service
public class TrainerServiceImpl implements TrainerService{
   @Autowired
    TrainerRepository trainerRepository;
    @Override
    public Boolean validateAndSave(TrainerDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<TrainerDto>> validate = validator.validate(dto);
        if (!validate.isEmpty()) {
            validate.stream().forEach(error -> System.out.println(error.getMessage()));
        } else {
            TrainerEntity trainerEntity = new TrainerEntity();
            try {
                BeanUtils.copyProperties(trainerEntity, dto);
                System.out.println(trainerEntity);
            } catch (IllegalAccessException | InvocationTargetException e) {
                System.out.println(e.getMessage());
            }
            trainerRepository.save(trainerEntity);
            System.out.println("All fields are validated and saved");
        }
        return null;
    }
}
