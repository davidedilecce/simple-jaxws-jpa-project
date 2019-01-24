package dao;

import model.Person;

import java.util.List;

/**
 * Created by davidevincenzodilecce on 23/01/2019.
 */
public interface PersonDAO {

    void update(Person person);
    void save(Person person);
    Person getById(Integer id);
    List<Person> findByName(String name);
    void delete(Integer id);

}
