package com.xworkz.studentapp.repository;

import com.xworkz.studentapp.entity.StudentEntity;

public interface StudentRepository {
    Boolean save(StudentEntity entity);
}
