package com.rastoychev18.vacationmanager.dao;

import com.rastoychev18.vacationmanager.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Repository
public class FakePersonDataAccessService implements PersonDao {
    private static List<User> DB=new ArrayList<>();
    @Override
    public int insertPerson(UUID id, User person) {
        DB.add(new User(id, person.getFirstName()));
        return 1;
    }
}
