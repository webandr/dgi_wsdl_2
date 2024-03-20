
package org.datacontract.schemas._2004._07.businesslogiclayer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ORG_GUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRequest", propOrder = {
    "orgguid"
})
@XmlSeeAlso({
    DocumentRequest.class,
    DocumentReceivedRequest.class,
    GetFileRequest.class
})
public class BaseRequest {

    @XmlElement(name = "ORG_GUID", required = true, nillable = true)
    protected String orgguid;

    /**
     * Gets the value of the orgguid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORGGUID() {
        return orgguid;
    }

    /**
     * Sets the value of the orgguid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORGGUID(String value) {
        this.orgguid = value;
    }

}
