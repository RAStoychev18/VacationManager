package com.rastoychev18.vacationmanager.api;

import com.rastoychev18.vacationmanager.model.User;
import com.rastoychev18.vacationmanager.service.PersonService;

public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    public void addPerson(User person){
        personService.addPerson(person);
    }
}
