
package applica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Classe Java per savePerson complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="savePerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://applica/}uiPerson" minOccurs="0"/>
 *         &lt;element name="data2" type="{http://applica/}uiPerson" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "savePerson", propOrder = {
    "data",
    "data2"
})
public class SavePerson {

    protected UiPerson data;
    protected List<UiPerson> data2;

    /**
     * Recupera il valore della proprietà data.
     * 
     * @return
     *     possible object is
     *     {@link UiPerson }
     *     
     */
    public UiPerson getData() {
        return data;
    }

    /**
     * Imposta il valore della proprietà data.
     * 
     * @param value
     *     allowed object is
     *     {@link UiPerson }
     *     
     */
    public void setData(UiPerson value) {
        this.data = value;
    }

    /**
     * Gets the value of the data2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UiPerson }
     * 
     * 
     */
    public List<UiPerson> getData2() {
        if (data2 == null) {
            data2 = new ArrayList<UiPerson>();
        }
        return this.data2;
    }

}
