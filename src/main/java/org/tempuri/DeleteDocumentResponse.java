
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
 *         &lt;element name="DeleteDocumentResult" type="{http://schemas.datacontract.org/2004/07/Common}DeleteDocumentResponse" minOccurs="0"/&gt;
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
    "deleteDocumentResult"
})
@XmlRootElement(name = "DeleteDocumentResponse")
public class DeleteDocumentResponse {

    @XmlElementRef(name = "DeleteDocumentResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.common.DeleteDocumentResponse> deleteDocumentResult;

    /**
     * Gets the value of the deleteDocumentResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.common.DeleteDocumentResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.common.DeleteDocumentResponse> getDeleteDocumentResult() {
        return deleteDocumentResult;
    }

    /**
     * Sets the value of the deleteDocumentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.common.DeleteDocumentResponse }{@code >}
     *     
     */
    public void setDeleteDocumentResult(JAXBElement<org.datacontract.schemas._2004._07.common.DeleteDocumentResponse> value) {
        this.deleteDocumentResult = value;
    }

}
