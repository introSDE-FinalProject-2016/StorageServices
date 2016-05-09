
package introsde.finalproject.soap.localdbservices.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPersonListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPersonListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="people" type="{http://ws.localdbservices.soap.finalproject.introsde/}personWrapper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonListResponse", propOrder = {
    "people"
})
public class GetPersonListResponse {

    protected PersonWrapper people;

    /**
     * Gets the value of the people property.
     * 
     * @return
     *     possible object is
     *     {@link PersonWrapper }
     *     
     */
    public PersonWrapper getPeople() {
        return people;
    }

    /**
     * Sets the value of the people property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonWrapper }
     *     
     */
    public void setPeople(PersonWrapper value) {
        this.people = value;
    }

}
