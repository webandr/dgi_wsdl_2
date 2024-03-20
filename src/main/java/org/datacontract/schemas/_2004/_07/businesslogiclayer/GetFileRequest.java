
package org.datacontract.schemas._2004._07.businesslogiclayer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFileRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFileRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService}BaseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID_FILE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFileRequest", propOrder = {
    "idfile"
})
public class GetFileRequest
    extends BaseRequest
{

    @XmlElement(name = "ID_FILE", required = true, type = Integer.class, nillable = true)
    protected Integer idfile;

    /**
     * Gets the value of the idfile property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDFILE() {
        return idfile;
    }

    /**
     * Sets the value of the idfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDFILE(Integer value) {
        this.idfile = value;
    }

}
