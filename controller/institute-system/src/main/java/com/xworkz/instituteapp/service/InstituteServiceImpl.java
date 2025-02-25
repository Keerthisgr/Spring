package com.xworkz.instituteapp.service;

import com.xworkz.instituteapp.dto.InstituteDto;
import com.xworkz.instituteapp.entity.InstituteEntity;
import com.xworkz.instituteapp.repository.InstituteRepository;
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
public class InstituteServiceImpl implements InstituteService{
    @Autowired
    InstituteRepository instituteRepository;

    @Override
    public Boolean validateAndSave(InstituteDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<InstituteDto>> validate = validator.validate(dto);
        if (!validate.isEmpty()) {
            validate.stream().forEach(error -> System.out.println(error.getMessage()));
        } else {
            InstituteEntity entity = new InstituteEntity();
            try {
                BeanUtils.copyProperties(entity, dto);
                System.out.println(entity);
            } catch (IllegalAccessException | InvocationTargetException e) {
                System.out.println(e.getMessage());
            }
            instituteRepository.save(entity);
            System.out.println("All fields are validated and saved");
        }
        return null;

    }
}
