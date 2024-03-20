
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.common.CreateFileRequest;


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
 *         &lt;element name="req" type="{http://schemas.datacontract.org/2004/07/Common}CreateFileRequest" minOccurs="0"/&gt;
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
    "req"
})
@XmlRootElement(name = "CreateFile")
public class CreateFile {

    @XmlElementRef(name = "req", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<CreateFileRequest> req;

    /**
     * Gets the value of the req property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreateFileRequest }{@code >}
     *     
     */
    public JAXBElement<CreateFileRequest> getReq() {
        return req;
    }

    /**
     * Sets the value of the req property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreateFileRequest }{@code >}
     *     
     */
    public void setReq(JAXBElement<CreateFileRequest> value) {
        this.req = value;
    }

}
