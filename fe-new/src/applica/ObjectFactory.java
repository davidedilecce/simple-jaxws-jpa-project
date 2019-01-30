
package applica;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the applica package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindPersons_QNAME = new QName("http://applica/", "findPersons");
    private final static QName _DeletePerson_QNAME = new QName("http://applica/", "deletePerson");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://applica/", "deletePersonResponse");
    private final static QName _FindPersonsResponse_QNAME = new QName("http://applica/", "findPersonsResponse");
    private final static QName _SavePerson_QNAME = new QName("http://applica/", "savePerson");
    private final static QName _SavePersonResponse_QNAME = new QName("http://applica/", "savePersonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: applica
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link FindPersons }
     * 
     */
    public FindPersons createFindPersons() {
        return new FindPersons();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link FindPersonsResponse }
     * 
     */
    public FindPersonsResponse createFindPersonsResponse() {
        return new FindPersonsResponse();
    }

    /**
     * Create an instance of {@link SavePerson }
     * 
     */
    public SavePerson createSavePerson() {
        return new SavePerson();
    }

    /**
     * Create an instance of {@link SavePersonResponse }
     * 
     */
    public SavePersonResponse createSavePersonResponse() {
        return new SavePersonResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link UiPerson }
     * 
     */
    public UiPerson createUiPerson() {
        return new UiPerson();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPersons }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applica/", name = "findPersons")
    public JAXBElement<FindPersons> createFindPersons(FindPersons value) {
        return new JAXBElement<FindPersons>(_FindPersons_QNAME, FindPersons.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applica/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applica/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPersonsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applica/", name = "findPersonsResponse")
    public JAXBElement<FindPersonsResponse> createFindPersonsResponse(FindPersonsResponse value) {
        return new JAXBElement<FindPersonsResponse>(_FindPersonsResponse_QNAME, FindPersonsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applica/", name = "savePerson")
    public JAXBElement<SavePerson> createSavePerson(SavePerson value) {
        return new JAXBElement<SavePerson>(_SavePerson_QNAME, SavePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applica/", name = "savePersonResponse")
    public JAXBElement<SavePersonResponse> createSavePersonResponse(SavePersonResponse value) {
        return new JAXBElement<SavePersonResponse>(_SavePersonResponse_QNAME, SavePersonResponse.class, null, value);
    }

}
