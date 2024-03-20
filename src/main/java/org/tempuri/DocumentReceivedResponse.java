
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.businesslogiclayer.BaseResponse;


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
 *         &lt;element name="DocumentReceivedResult" type="{http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService}BaseResponse" minOccurs="0"/&gt;
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
    "documentReceivedResult"
})
@XmlRootElement(name = "DocumentReceivedResponse")
public class DocumentReceivedResponse {

    @XmlElementRef(name = "DocumentReceivedResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<BaseResponse> documentReceivedResult;

    /**
     * Gets the value of the documentReceivedResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}
     *     
     */
    public JAXBElement<BaseResponse> getDocumentReceivedResult() {
        return documentReceivedResult;
    }

    /**
     * Sets the value of the documentReceivedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}
     *     
     */
    public void setDocumentReceivedResult(JAXBElement<BaseResponse> value) {
        this.documentReceivedResult = value;
    }

}
