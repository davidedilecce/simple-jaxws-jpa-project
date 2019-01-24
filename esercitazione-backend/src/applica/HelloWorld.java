package applica;

import facade.PersonFacade;
import utils.ApplicationContextProvider;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by davidevincenzodilecce on 22/01/2019.
 */

@WebService()
public class HelloWorld {

    @WebMethod
    public void savePerson(@WebParam(name = "id") Integer id,@WebParam(name = "name") String name, @WebParam(name = "surname") String surname, @WebParam(name = "age") Integer age, @WebParam(name = "fiscalCode") String fiscalCode) {
        PersonFacade personFacade = ApplicationContextProvider.provide().getBean(PersonFacade.class);
        personFacade.save(id, name, surname, age, fiscalCode);
    }

    @WebMethod
    public void deletePerson(@WebParam(name = "id") Integer id) {
        PersonFacade personFacade = ApplicationContextProvider.provide().getBean(PersonFacade.class);
        personFacade.delete(id);
    }



}
