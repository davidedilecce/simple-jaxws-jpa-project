package applica;

import facade.PersonFacade;
import model.Person;
import utils.ApplicationContextProvider;
import viewmodel.UIPerson;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by davidevincenzodilecce on 22/01/2019.
 */

@WebService()
public class HelloWorld {

    @WebMethod
    //public void savePerson(@WebParam(name = "id") Integer id,@WebParam(name = "name") String name, @WebParam(name = "surname") String surname, @WebParam(name = "age") Integer age, @WebParam(name = "fiscalCode") String fiscalCode) {
    public Integer savePerson(@WebParam(name="data") UIPerson person, @WebParam(name = "data2") List<UIPerson> ciao) {
        PersonFacade personFacade = ApplicationContextProvider.provide().getBean(PersonFacade.class);
        return personFacade.save(person.getId(), person.getName(), person.getSurname(), person.getAge(), person.getFiscalCode());
    }

    @WebMethod
    public void deletePerson(@WebParam(name = "id") Integer id) {
        PersonFacade personFacade = ApplicationContextProvider.provide().getBean(PersonFacade.class);
        personFacade.delete(id);
    }

    @WebMethod
    public List<Person> findPersons() {
        PersonFacade personFacade = ApplicationContextProvider.provide().getBean(PersonFacade.class);
        return personFacade.findPersons();
    }


}
