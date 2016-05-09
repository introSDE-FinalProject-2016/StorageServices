
package introsde.finalproject.soap.localdbservices.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getHistoryHealthResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
     * Recupera il valore della proprietà historyHealth.
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
     * Imposta il valore della proprietà historyHealth.
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
