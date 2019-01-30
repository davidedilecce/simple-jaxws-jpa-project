package example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

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


    public String getInputData() {
        return String.format("%s %s %s %s", name, surname, age, fiscalCode);
    }

    public void saveDatas() {
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
}