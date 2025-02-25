package com.xworkz.countryapp.repository;

import com.xworkz.countryapp.entity.BookEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

@Component
public class BookRepositoryImpl implements BookRepository {
    static private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Keerthi");

    @Override
    public boolean save(BookEntity bookEntity) {
        boolean isSaved = false;
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(bookEntity);
            entityManager.getTransaction().commit();
            isSaved = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
        } finally {
            entityManager.close();
        }
        return isSaved;
    }

    @Override
    public BookEntity getById(Integer id) {
        EntityManager entityManager = emf.createEntityManager();
        return entityManager.find(BookEntity.class, id);
    }

    @Override
    public BookEntity getByName(String bookName) {
        EntityManager entityManager = emf.createEntityManager();
        Query getByName = entityManager.createNamedQuery("getByName");
        getByName.setParameter("bookName", bookName);
        try {
            BookEntity singleResult = (BookEntity) getByName.getSingleResult();
            return singleResult;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public Integer updateByName(String bookName, String authorName) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query updateByName = entityManager.createNamedQuery("updateByName");
            updateByName.setParameter("authorName", authorName);
            updateByName.setParameter("bookName", bookName);
            int row = updateByName.executeUpdate();
            entityManager.getTransaction().commit();
            return row;
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return 0;
    }


    @Override
    public Integer deleteById(Integer id) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query deleteById = entityManager.createNamedQuery("deleteById");
            deleteById.setParameter("id", id);
            int row = deleteById.executeUpdate();
            entityManager.getTransaction().commit();
            return row;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public Integer updateBookAndAuthorById(String authorName, String bookName, Integer id) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query updateBookAndAuthorNameById = entityManager.createNamedQuery("updateBookAndAuthorNameById");
            updateBookAndAuthorNameById.setParameter("authorName", authorName);
            updateBookAndAuthorNameById.setParameter("bookName", bookName);
            updateBookAndAuthorNameById.setParameter("id", id);
            int row = updateBookAndAuthorNameById.executeUpdate();
            entityManager.getTransaction().commit();
            return row;
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return 0;
    }

    @Override
    public BookEntity getByAuthorName(String authorName) {
        EntityManager entityManager = emf.createEntityManager();
        Query getByName = entityManager.createNamedQuery("getByAuthorName");
        getByName.setParameter("authorName", authorName);
        try {
            BookEntity singleResult = (BookEntity) getByName.getSingleResult();
            return singleResult;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public List<BookEntity> getAllData() {
        EntityManager entityManager = emf.createEntityManager();

        try {
            return entityManager.createNamedQuery("getAllData", BookEntity.class).getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            entityManager.close();
        }
    }
}




