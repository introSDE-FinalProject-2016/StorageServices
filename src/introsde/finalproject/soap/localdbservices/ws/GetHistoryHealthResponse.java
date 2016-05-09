
package introsde.finalproject.soap.localdbservices.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getHistoryHealthResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getHistoryHealthResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="historyHealth" type="{http://ws.localdbservices.soap.finalproject.introsde/}measureWrapper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHistoryHealthResponse", propOrder = {
    "historyHealth"
})
public class GetHistoryHealthResponse {

    protected MeasureWrapper historyHealth;

    /**
     * Gets the value of the historyHealth property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureWrapper }
     *     
     */
    public MeasureWrapper getHistoryHealth() {
        return historyHealth;
    }

    /**
     * Sets the value of the historyHealth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureWrapper }
     *     
     */
    public void setHistoryHealth(MeasureWrapper value) {
        this.historyHealth = value;
    }

}
