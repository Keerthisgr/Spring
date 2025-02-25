package com.xworkz.studentapp.service;

import com.xworkz.studentapp.dto.StudentDto;
import com.xworkz.studentapp.entity.StudentEntity;
import com.xworkz.studentapp.repository.StudentRepository;
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
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;
    @Override
    public Boolean validateAndSaveUser(StudentDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<StudentDto>> validate = validator.validate(dto);
        if(!validate.isEmpty()){
            validate.stream().forEach(error -> System.out.println(error.getMessage()));
        }else {
            StudentEntity studentEntity = new StudentEntity();
            try{
                BeanUtils.copyProperties(studentEntity,dto);
                System.out.println(studentEntity);
            } catch (IllegalAccessException | InvocationTargetException e) {
                System.out.println(e.getMessage());
            }
            studentRepository.save(studentEntity);
            System.out.println("All fields are validated and saved");
        }
        return null;
    }
}
