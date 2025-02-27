package com.xworkz.userapp.repository;

import com.xworkz.userapp.entity.UserEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository{
    private EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("test");



    @Override
    public boolean saveUser(UserEntity entity) {
        EntityManager entityManager =  entityManagerFactory.createEntityManager() ;
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public List<UserEntity> getAllUsers() {
        System.out.println(entityManagerFactory.createEntityManager().createNamedQuery("getAllUsers").getResultList());
        return  entityManagerFactory.createEntityManager().createNamedQuery("getAllUsers").getResultList() ;
    }

    @Override
    public void deleteUserById(int id) {
        EntityManager entityManager  =   entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.createNamedQuery("deleteUser").setParameter("id",id).executeUpdate();
        entityManager.getTransaction().commit();
    }

    @Override
    public UserEntity fetchUserById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        UserEntity userEntity = (UserEntity) entityManager.createNamedQuery("getUserById").setParameter("id",id).getSingleResult();
        return userEntity;

    }

    @Override
    public boolean updateUser(UserEntity userEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(userEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }
}
