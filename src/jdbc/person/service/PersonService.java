package jdbc.person.service;

import jdbc.person.entity.Person;

import java.sql.Connection;
import java.util.List;

public interface PersonService {
    Connection getConnection();
    void insert(Person person);
    void update();
    void delete();
    List<Person> display();
}
