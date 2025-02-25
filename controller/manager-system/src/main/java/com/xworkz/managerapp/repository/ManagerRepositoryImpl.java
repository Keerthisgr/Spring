package com.xworkz.managerapp.repository;

import com.xworkz.managerapp.entity.ManagerEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Repository
public class ManagerRepositoryImpl implements ManagerRepository{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("keerthi");

    @Override
    public Boolean save(ManagerEntity entity) {
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
