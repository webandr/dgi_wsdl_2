
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
 *         &lt;element name="CreateFileResult" type="{http://schemas.datacontract.org/2004/07/Common}CreateFileResponse" minOccurs="0"/&gt;
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
    "createFileResult"
})
@XmlRootElement(name = "CreateFileResponse")
public class CreateFileResponse {

    @XmlElementRef(name = "CreateFileResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.common.CreateFileResponse> createFileResult;

    /**
     * Gets the value of the createFileResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.common.CreateFileResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.common.CreateFileResponse> getCreateFileResult() {
        return createFileResult;
    }

    /**
     * Sets the value of the createFileResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.common.CreateFileResponse }{@code >}
     *     
     */
    public void setCreateFileResult(JAXBElement<org.datacontract.schemas._2004._07.common.CreateFileResponse> value) {
        this.createFileResult = value;
    }

}
