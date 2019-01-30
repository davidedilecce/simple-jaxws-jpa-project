package facade;

import dao.PersonDAO;
import model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by davidevincenzodilecce on 23/01/2019.
 */
@Component
public class PersonFacade {

    @Autowired
    private PersonDAO dao;

    public Integer save(Integer id, String name, String surname, Integer age, String fiscalCode) {
        if (id == null) {
            return dao.save(new Person(id, name, surname, age, fiscalCode));
        } else {
            Person person = dao.getById(id);
            if (person != null) {
                person.setName(name);
                person.setSurname(surname);
                person.setAge(age);
                person.setFiscalCode(fiscalCode);
                dao.update(person);
            }
            return person.getIdFromEntity();
        }
    }

    public void delete(Integer id) {
        dao.delete(id);
    }

    public List<Person> findPersons() {
        return dao.findByName();
    }

}