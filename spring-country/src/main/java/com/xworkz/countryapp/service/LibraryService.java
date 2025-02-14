package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.LibraryDto;
import com.xworkz.countryapp.dto.MobileDto;

public interface LibraryService {
    Boolean validateAndSave(LibraryDto dto);

}
