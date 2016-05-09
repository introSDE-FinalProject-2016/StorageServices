
package introsde.finalproject.soap.localdbservices.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMeasureDefinitionNamesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMeasureDefinitionNamesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measureNames" type="{http://ws.localdbservices.soap.finalproject.introsde/}measureDefinitionWrapper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMeasureDefinitionNamesResponse", propOrder = {
    "measureNames"
})
public class GetMeasureDefinitionNamesResponse {

    protected MeasureDefinitionWrapper measureNames;

    /**
     * Gets the value of the measureNames property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureDefinitionWrapper }
     *     
     */
    public MeasureDefinitionWrapper getMeasureNames() {
        return measureNames;
    }

    /**
     * Sets the value of the measureNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureDefinitionWrapper }
     *     
     */
    public void setMeasureNames(MeasureDefinitionWrapper value) {
        this.measureNames = value;
    }

}
