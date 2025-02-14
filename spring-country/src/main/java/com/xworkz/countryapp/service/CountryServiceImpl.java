package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.CountryDto;
import com.xworkz.countryapp.entity.CountryEntity;
import com.xworkz.countryapp.repository.CountryRepositoryImpl;
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
public class CountryServiceImpl implements CountryService {

    @Autowired
    CountryRepositoryImpl countryRepository;

    @Override
    public Boolean validateAndSave(CountryDto countryDto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<CountryDto>> validate = validator.validate(countryDto);
        boolean isSaved = false;
        if (validate.isEmpty()) {
            CountryEntity countryEntity = new CountryEntity();
            try {
                BeanUtils.copyProperties(countryDto, countryEntity);
                countryRepository.save(countryEntity);
                isSaved = true;
                System.out.println(countryEntity);
            } catch (BeansException e) {
                System.out.println(e.getMessage());
            }
        } else {
            validate.stream().forEach(error -> System.out.println(error.getMessage()));
        }
        return isSaved;
    }
}
