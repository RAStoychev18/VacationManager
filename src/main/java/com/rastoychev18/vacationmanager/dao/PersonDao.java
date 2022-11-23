package com.rastoychev18.vacationmanager.dao;

import com.rastoychev18.vacationmanager.model.User;
import java.util.UUID;
public interface PersonDao {
    int insertPerson(UUID id, User person);
    default int insertPerson(User person){
        UUID id =UUID.randomUUID();
        return insertPerson(id,person);
    }
}
