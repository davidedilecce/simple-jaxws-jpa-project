package model;

import javax.persistence.*;

/**
 * Created by davidevincenzodilecce on 22/01/2019.
 */
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    private String name;

    private String surname;

    private Integer age;

    private String fiscalCode;


    public Person() {
    }

    public Person(Integer id, String name, String surname, Integer age, String fiscalCode) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.fiscalCode = fiscalCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
