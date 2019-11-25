package rest.service;

import java.util.List;

import org.springframework.stereotype.Component;

import rest.entity.Person;

@Component
public interface PersonService {
    List<Person> getAll();
    Person get(Long id);
    Person delete(Long id);
    Person create(String name);
}
