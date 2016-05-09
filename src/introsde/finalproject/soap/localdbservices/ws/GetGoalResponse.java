
package introsde.finalproject.soap.localdbservices.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getGoalResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getGoalResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="goals" type="{http://ws.localdbservices.soap.finalproject.introsde/}goalWrapper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGoalResponse", propOrder = {
    "goals"
})
public class GetGoalResponse {

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
