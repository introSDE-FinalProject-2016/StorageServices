
package introsde.finalproject.soap.localdbservices.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getMeasureDefinitionNamesResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getMeasureDefinitionNamesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ws.localdbservices.soap.finalproject.introsde/}measureNames" minOccurs="0"/>
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

    @XmlElement(namespace = "http://ws.localdbservices.soap.finalproject.introsde/")
    protected MeasureDefinitionWrapper measureNames;

    /**
     * Recupera il valore della proprieta measureNames.
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
     * Imposta il valore della proprieta measureNames.
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
