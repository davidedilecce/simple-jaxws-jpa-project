package applica;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidevincenzodilecce on 30/01/2019.
 */
@ManagedBean(name = "personData")
@SessionScoped
public class PersonData implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private String surname;
    private Integer age;
    private String fiscalCode;

    private String statusMessage;

    private List<UiPerson> persons = new ArrayList<>();


    @PostConstruct
    public void init() {
        HelloWorld service = new HelloWorldService().getHelloWorldPort();
        for (Person p : service.findPersons()) {
            persons.add(new UiPerson(p));
        }
    }

    public String getInputData() {
        return String.format("%s %s %s %s", name, surname, age, fiscalCode);
    }

    public void saveDatas() {
        try {
            statusMessage = null;
            HelloWorld service = new HelloWorldService().getHelloWorldPort();
            UiPerson uiPerson = new UiPerson(age, fiscalCode, null, name, surname);
            uiPerson.setId(service.savePerson(uiPerson, null));
            statusMessage = "OK";
            persons.add(uiPerson);
            clear();
        } catch (Exception e) {
            statusMessage = "FAIL";
        }
    }

    public void deleteData(Integer id) {
        try {
            statusMessage = null;
            HelloWorld service = new HelloWorldService().getHelloWorldPort();
            service.deletePerson(id);
            statusMessage = "OK";
            List<UiPerson> newPersons = new ArrayList<>();
            for (UiPerson person : persons) {
                if (person.getId() != id) {
                    newPersons.add(person);
                }
            }
            persons = newPersons;
            clear();
        } catch (Exception e) {
            statusMessage = "FAIL";
        }
    }

    public void clear() {
        age = null;
        fiscalCode = null;
        name = null;
        surname = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public String getStatusMessage() {
        return String.format("%s %s", "Stato chiamata: ", statusMessage);
    }

    public List<UiPerson> getPersons() {
        return persons;
    }

    public void setPersons(List<UiPerson> persons) {
        this.persons = persons;
    }
}