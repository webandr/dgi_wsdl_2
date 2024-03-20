
package org.datacontract.schemas._2004._07.businesslogiclayer;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentReceivedRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentReceivedRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService}BaseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID_DOCUMENTRES" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentReceivedRequest", propOrder = {
    "iddocumentres"
})
public class DocumentReceivedRequest
    extends BaseRequest
{

    @XmlElement(name = "ID_DOCUMENTRES", required = true)
    protected BigDecimal iddocumentres;

    /**
     * Gets the value of the iddocumentres property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIDDOCUMENTRES() {
        return iddocumentres;
    }

    /**
     * Sets the value of the iddocumentres property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIDDOCUMENTRES(BigDecimal value) {
        this.iddocumentres = value;
    }

}
