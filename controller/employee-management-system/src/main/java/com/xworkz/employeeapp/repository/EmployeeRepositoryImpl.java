package com.xworkz.employeeapp.repository;

import com.xworkz.employeeapp.entity.EmployeeEntity;
import com.xworkz.employeeapp.entity.EmployeeEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("keerthi");

    @Override
    public Boolean save(EmployeeEntity entity) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
                return false;
            } else {
                return false;
            }
        } finally {
            entityManager.close();
        }
    }
}
