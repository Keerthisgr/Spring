package com.xworkz.countryapp.repository;

import com.xworkz.countryapp.entity.CountryEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
@Component
public class CountryRepositoryImpl implements CountryRepository{
    static private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Keerthi");
    @Override
    public boolean save(CountryEntity countryEntity) {
        boolean isSaved=false;
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(countryEntity);
            entityManager.getTransaction().commit();
            isSaved = true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            if(entityManager.getTransaction().isActive()){
                entityManager.getTransaction().rollback();
            }
        }
        finally {
            entityManager.close();
        }
        return isSaved;
    }
}
