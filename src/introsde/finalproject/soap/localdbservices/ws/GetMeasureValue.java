
package introsde.finalproject.soap.localdbservices.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getMeasureValue complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getMeasureValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="measureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMeasureValue", propOrder = {
    "pid",
    "measureName",
    "mid"
})
public class GetMeasureValue {

    protected int pid;
    protected String measureName;
    protected int mid;

    /**
     * Recupera il valore della proprieta pid.
     * 
     */
    public int getPid() {
        return pid;
    }

    /**
     * Imposta il valore della proprieta pid.
     * 
     */
    public void setPid(int value) {
        this.pid = value;
    }

    /**
     * Recupera il valore della proprieta measureName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureName() {
        return measureName;
    }

    /**
     * Imposta il valore della proprieta measureName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureName(String value) {
        this.measureName = value;
    }

    /**
     * Recupera il valore della proprieta mid.
     * 
     */
    public int getMid() {
        return mid;
    }

    /**
     * Imposta il valore della proprieta mid.
     * 
     */
    public void setMid(int value) {
        this.mid = value;
    }

}
