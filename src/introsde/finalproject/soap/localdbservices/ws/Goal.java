
package introsde.finalproject.soap.localdbservices.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per goal complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="goal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDateGoal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDateGoal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="achieved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "goal", propOrder = {
    "gid",
    "type",
    "value",
    "startDateGoal",
    "endDateGoal",
    "achieved"
})
public class Goal {

    protected int gid;
    protected String type;
    protected String value;
    protected String startDateGoal;
    protected String endDateGoal;
    protected Boolean achieved;

    /**
     * Recupera il valore della proprietà gid.
     * 
     */
    public int getGid() {
        return gid;
    }

    /**
     * Imposta il valore della proprietà gid.
     * 
     */
    public void setGid(int value) {
        this.gid = value;
    }

    /**
     * Recupera il valore della proprietà type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Recupera il valore della proprietà startDateGoal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDateGoal() {
        return startDateGoal;
    }

    /**
     * Imposta il valore della proprietà startDateGoal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateGoal(String value) {
        this.startDateGoal = value;
    }

    /**
     * Recupera il valore della proprietà endDateGoal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDateGoal() {
        return endDateGoal;
    }

    /**
     * Imposta il valore della proprietà endDateGoal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDateGoal(String value) {
        this.endDateGoal = value;
    }

    /**
     * Recupera il valore della proprietà achieved.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAchieved() {
        return achieved;
    }

    /**
     * Imposta il valore della proprietà achieved.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAchieved(Boolean value) {
        this.achieved = value;
    }

}
