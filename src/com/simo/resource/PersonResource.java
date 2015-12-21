package com.simo.resource;

import com.simo.model.PersonBean;
import com.simo.model.PersonEntity;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by PS on 12/17/15.
 */
@Stateless(name = "PersonResource")
public class PersonResource implements PersonBean {

    EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("JPADemoDatabase");
    @Override
    public void addPerson(Integer ssn, String name) {
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        PersonEntity entity= new PersonEntity();
        entity.setSsn(ssn);
        entity.setName(name);
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public String showPerson() {
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        PersonEntity entity=(PersonEntity)entityManager.find(PersonEntity.class, 1);
        entityManager.getTransaction().commit();
        entityManager.close();

        return entity.getName();
    }
}
