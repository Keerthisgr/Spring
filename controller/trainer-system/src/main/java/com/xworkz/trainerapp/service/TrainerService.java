package com.xworkz.trainerapp.service;

import com.xworkz.trainerapp.dto.TrainerDto;

public interface TrainerService {
    Boolean validateAndSave(TrainerDto dto);

}
