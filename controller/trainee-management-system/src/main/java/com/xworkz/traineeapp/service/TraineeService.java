package com.xworkz.traineeapp.service;

import com.xworkz.traineeapp.dto.TraineeDto;

public interface TraineeService {
    Boolean validateAndSave(TraineeDto dto);

}
