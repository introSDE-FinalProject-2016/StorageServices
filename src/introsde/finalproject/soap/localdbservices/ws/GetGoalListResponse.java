
package introsde.finalproject.soap.localdbservices.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getGoalListResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getGoalListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ws.localdbservices.soap.finalproject.introsde/}goals" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGoalListResponse", propOrder = {
    "goals"
})
public class GetGoalListResponse {

    @XmlElement(namespace = "http://ws.localdbservices.soap.finalproject.introsde/")
    protected GoalWrapper goals;

    /**
     * Recupera il valore della proprietà goals.
     * 
     * @return
     *     possible object is
     *     {@link GoalWrapper }
     *     
     */
    public GoalWrapper getGoals() {
        return goals;
    }

    /**
     * Imposta il valore della proprietà goals.
     * 
     * @param value
     *     allowed object is
     *     {@link GoalWrapper }
     *     
     */
    public void setGoals(GoalWrapper value) {
        this.goals = value;
    }

}
