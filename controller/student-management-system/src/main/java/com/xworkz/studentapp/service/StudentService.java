package com.xworkz.studentapp.service;

import com.xworkz.studentapp.dto.StudentDto;

public interface StudentService {
    Boolean validateAndSaveUser(StudentDto dto);
}
