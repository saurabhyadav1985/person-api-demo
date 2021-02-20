package org.example.person.repositories;

import org.example.person.models.Person;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;

public class PersonRepository extends SimpleJpaRepository<Person, Long> {
    public PersonRepository(JpaEntityInformation<Person, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
    }
}
