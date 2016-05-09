
package introsde.finalproject.soap.localdbservices.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMeasureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMeasureResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measuresHealth" type="{http://ws.localdbservices.soap.finalproject.introsde/}measureWrapper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMeasureResponse", propOrder = {
    "measuresHealth"
})
public class GetMeasureResponse {

    protected MeasureWrapper measuresHealth;

    /**
     * Gets the value of the measuresHealth property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureWrapper }
     *     
     */
    public MeasureWrapper getMeasuresHealth() {
        return measuresHealth;
    }

    /**
     * Sets the value of the measuresHealth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureWrapper }
     *     
     */
    public void setMeasuresHealth(MeasureWrapper value) {
        this.measuresHealth = value;
    }

}
