package rest.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Component;

import rest.entity.Person;

@Component
public class DefaultPersonService implements PersonService {
    
    @Override
    public List<Person> getAll() {
        return new ArrayList<Person>(Arrays.asList(Person.values()));
    }

    @Override
    public Person get(Long id) {
        return Person.findById(id); 
    }
    
    @Override
    public Person delete(Long id) {
        Person person = Person.findById(id);
        person.setExist(false);
        return person;
    }

    @Override
    public Person create(String name) {
       return Person.findByName(name); 
    }
}
