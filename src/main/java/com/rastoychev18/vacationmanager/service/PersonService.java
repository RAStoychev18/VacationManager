package com.rastoychev18.vacationmanager.service;

import com.rastoychev18.vacationmanager.dao.PersonDao;
import com.rastoychev18.vacationmanager.model.Person;

public class PersonService {
    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }
}
