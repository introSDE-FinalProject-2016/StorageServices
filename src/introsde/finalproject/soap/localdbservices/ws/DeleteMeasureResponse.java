
package introsde.finalproject.soap.localdbservices.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteMeasureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteMeasureResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseMeasureCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteMeasureResponse", propOrder = {
    "responseMeasureCode"
})
public class DeleteMeasureResponse {

    protected int responseMeasureCode;

    /**
     * Gets the value of the responseMeasureCode property.
     * 
     */
    public int getResponseMeasureCode() {
        return responseMeasureCode;
    }

    /**
     * Sets the value of the responseMeasureCode property.
     * 
     */
    public void setResponseMeasureCode(int value) {
        this.responseMeasureCode = value;
    }

}
