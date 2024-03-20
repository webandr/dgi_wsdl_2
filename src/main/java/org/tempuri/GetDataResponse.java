
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.businesslogiclayer.DocumentResponse;


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
 *         &lt;element name="GetDataResult" type="{http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService}DocumentResponse" minOccurs="0"/&gt;
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
    "getDataResult"
})
@XmlRootElement(name = "GetDataResponse")
public class GetDataResponse {

    @XmlElementRef(name = "GetDataResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<DocumentResponse> getDataResult;

    /**
     * Gets the value of the getDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocumentResponse }{@code >}
     *     
     */
    public JAXBElement<DocumentResponse> getGetDataResult() {
        return getDataResult;
    }

    /**
     * Sets the value of the getDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocumentResponse }{@code >}
     *     
     */
    public void setGetDataResult(JAXBElement<DocumentResponse> value) {
        this.getDataResult = value;
    }

}
