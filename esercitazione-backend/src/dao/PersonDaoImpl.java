package dao;

import model.Person;
import org.springframework.stereotype.Repository;
import persistence.CrudUtils;

import java.util.List;

/**
 * Created by davidevincenzodilecce on 23/01/2019.
 */
@Repository
public class PersonDaoImpl implements PersonDAO {

    @Override
    public void update(Person person) {
        CrudUtils.instance().update(person);
    }

    @Override
    public void save(Person person) {
        CrudUtils.instance().save(person);
    }

    @Override
    public Person getById(Integer id) {
        return (Person) CrudUtils.instance().getById(id, Person.class);
    }

    @Override
    public List<Person> findByName(String name) {
        return CrudUtils.instance().find("SELECT p FROM Person p", Person.class);
    }

    @Override
    public void delete(Integer id) {
        CrudUtils.instance().delete(getById(id));
    }

}
