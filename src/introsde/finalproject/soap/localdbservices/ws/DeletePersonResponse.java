
package introsde.finalproject.soap.localdbservices.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deletePersonResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deletePersonResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responsePersonCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deletePersonResponse", propOrder = {
    "responsePersonCode"
})
public class DeletePersonResponse {

    protected int responsePersonCode;

    /**
     * Gets the value of the responsePersonCode property.
     * 
     */
    public int getResponsePersonCode() {
        return responsePersonCode;
    }

    /**
     * Sets the value of the responsePersonCode property.
     * 
     */
    public void setResponsePersonCode(int value) {
        this.responsePersonCode = value;
    }

}
