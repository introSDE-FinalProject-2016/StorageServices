
package introsde.finalproject.soap.localdbservices.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per deleteGoalResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="deleteGoalResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseGoalCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteGoalResponse", propOrder = {
    "responseGoalCode"
})
public class DeleteGoalResponse {

    protected int responseGoalCode;

    /**
     * Recupera il valore della proprietà responseGoalCode.
     * 
     */
    public int getResponseGoalCode() {
        return responseGoalCode;
    }

    /**
     * Imposta il valore della proprietà responseGoalCode.
     * 
     */
    public void setResponseGoalCode(int value) {
        this.responseGoalCode = value;
    }

}
