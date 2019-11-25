package rest.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import rest.service.PersonService;
import rest.entity.Person;

@RestController
@RequestMapping("/persons")
class PersonController {

    @Autowired
    private PersonService personService;


    @RequestMapping(value={"", "/"}, method=RequestMethod.GET)
    public ResponseEntity<List<Person>> getAll() {
        return new ResponseEntity<List<Person>>(personService.getAll(), HttpStatus.OK);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<Person> get(@PathVariable("id") Long id) {
        return new ResponseEntity<Person>(personService.get(id), HttpStatus.OK);
    }

    @RequestMapping(value={"", "/"}, method=RequestMethod.POST)
    public ResponseEntity<Person> create(String name) {
        return new ResponseEntity<Person>(personService.create(name), HttpStatus.OK);
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Person> delete(@PathVariable("id") Long id) {
        return new ResponseEntity<Person>(personService.delete(id), HttpStatus.OK);
    }


}
