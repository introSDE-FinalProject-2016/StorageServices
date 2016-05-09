
package introsde.finalproject.soap.localdbservices.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteGoalResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteGoalResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseGoalCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteGoalResponse", propOrder = {
    "responseGoalCode"
})
public class DeleteGoalResponse {

    protected int responseGoalCode;

    /**
     * Gets the value of the responseGoalCode property.
     * 
     */
    public int getResponseGoalCode() {
        return responseGoalCode;
    }

    /**
     * Sets the value of the responseGoalCode property.
     * 
     */
    public void setResponseGoalCode(int value) {
        this.responseGoalCode = value;
    }

}
