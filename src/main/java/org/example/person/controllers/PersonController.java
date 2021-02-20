package org.example.person.controllers;

import org.example.person.models.Person;
import org.example.person.repositories.PersonRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/persons")
public class PersonController {

    @Autowired
    private PersonRepository repository;

    @GetMapping("{id}")
    public Person get(@PathVariable long id) {
        return repository.find(id);
    }

    @GetMapping
    public List<Person> list(){
        return repository.list();
    }

    @PostMapping
    public Person create(@RequestBody final Person person) {
        System.out.println(person);
        return repository.create(person);
    }

    @PutMapping("{id}")
    public void update(@PathVariable Long id, @RequestBody final Person person) {
        Person existingPerson = repository.find(id);
        BeanUtils.copyProperties(person, existingPerson, "id");
        repository.update(person);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        Person existingPerson = repository.find(id);
        repository.delete(existingPerson);
    }

}
