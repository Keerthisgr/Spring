package com.xworkz.instituteapp.service;

import com.xworkz.instituteapp.dto.InstituteDto;

public interface InstituteService {
    Boolean validateAndSave(InstituteDto dto);

}
