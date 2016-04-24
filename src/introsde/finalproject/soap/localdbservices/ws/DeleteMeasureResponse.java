
package introsde.finalproject.soap.localdbservices.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per deleteMeasureResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="deleteMeasureResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseMeasureCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteMeasureResponse", propOrder = {
    "responseMeasureCode"
})
public class DeleteMeasureResponse {

    protected int responseMeasureCode;

    /**
     * Recupera il valore della proprietà responseMeasureCode.
     * 
     */
    public int getResponseMeasureCode() {
        return responseMeasureCode;
    }

    /**
     * Imposta il valore della proprietà responseMeasureCode.
     * 
     */
    public void setResponseMeasureCode(int value) {
        this.responseMeasureCode = value;
    }

}
