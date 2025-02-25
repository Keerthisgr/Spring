package com.xworkz.traineeapp.service;

import com.xworkz.traineeapp.dto.TraineeDto;
import com.xworkz.traineeapp.entity.TraineeEntity;
import com.xworkz.traineeapp.repository.TraineeRepository;
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
public class TraineeServiceImpl implements TraineeService{
   @Autowired
    TraineeRepository traineeRepository;
    @Override
    public Boolean validateAndSave(TraineeDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<TraineeDto>> validate = validator.validate(dto);
        if (!validate.isEmpty()) {
            validate.stream().forEach(error -> System.out.println(error.getMessage()));
        } else {
            TraineeEntity traineeEntity = new TraineeEntity();
            try {
                BeanUtils.copyProperties(traineeEntity, dto);
                System.out.println(traineeEntity);
            } catch (IllegalAccessException | InvocationTargetException e) {
                System.out.println(e.getMessage());
            }
            traineeRepository.save(traineeEntity);
            System.out.println("All fields are validated and saved");
        }
        return null;
    }
}
