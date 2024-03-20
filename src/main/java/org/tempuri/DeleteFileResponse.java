
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
 *         &lt;element name="DeleteFileResult" type="{http://schemas.datacontract.org/2004/07/Common}DeleteFileResponse" minOccurs="0"/&gt;
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
    "deleteFileResult"
})
@XmlRootElement(name = "DeleteFileResponse")
public class DeleteFileResponse {

    @XmlElementRef(name = "DeleteFileResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.common.DeleteFileResponse> deleteFileResult;

    /**
     * Gets the value of the deleteFileResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.common.DeleteFileResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.common.DeleteFileResponse> getDeleteFileResult() {
        return deleteFileResult;
    }

    /**
     * Sets the value of the deleteFileResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.common.DeleteFileResponse }{@code >}
     *     
     */
    public void setDeleteFileResult(JAXBElement<org.datacontract.schemas._2004._07.common.DeleteFileResponse> value) {
        this.deleteFileResult = value;
    }

}
