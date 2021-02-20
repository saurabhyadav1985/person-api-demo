package org.example.person.repositories;

import org.example.person.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class PersonRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    PersonJpaRepository jpaRepository;

    @Transactional
    public Person create(Person person) {
        entityManager.persist(person);
        entityManager.flush();
        return person;
    }

    @Transactional
    public Person update(Person person) {
        person = entityManager.merge(person);
        entityManager.flush();
        return person;
    }

    @Transactional
    public void delete(Person person) {
        entityManager.remove(person);
        entityManager.flush();
    }

    public Person find(Long id) {
        return entityManager.find(Person.class, id);
    }

    public List<Person> list() {
        return jpaRepository.findAll();
    }
}
