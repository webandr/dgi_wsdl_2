
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetChangesResult" type="{http://schemas.datacontract.org/2004/07/Common}GetChangesResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getChangesResult"
})
@XmlRootElement(name = "GetChangesResponse")
public class GetChangesResponse {

    @XmlElementRef(name = "GetChangesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.common.GetChangesResponse> getChangesResult;

    /**
     * Gets the value of the getChangesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.common.GetChangesResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.common.GetChangesResponse> getGetChangesResult() {
        return getChangesResult;
    }

    /**
     * Sets the value of the getChangesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.common.GetChangesResponse }{@code >}
     *     
     */
    public void setGetChangesResult(JAXBElement<org.datacontract.schemas._2004._07.common.GetChangesResponse> value) {
        this.getChangesResult = value;
    }

}
