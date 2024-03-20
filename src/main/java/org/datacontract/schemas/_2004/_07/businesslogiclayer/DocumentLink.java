
package org.datacontract.schemas._2004._07.businesslogiclayer;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentLink"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FILE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID_FILE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SIG" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentLink", propOrder = {
    "desc",
    "filename",
    "idfile",
    "sig"
})
public class DocumentLink {

    @XmlElementRef(name = "DESC", namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desc;
    @XmlElementRef(name = "FILE_NAME", namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filename;
    @XmlElementRef(name = "ID_FILE", namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> idfile;
    @XmlElementRef(name = "SIG", namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> sig;

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDESC() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDESC(JAXBElement<String> value) {
        this.desc = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFILENAME() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFILENAME(JAXBElement<String> value) {
        this.filename = value;
    }

    /**
     * Gets the value of the idfile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIDFILE() {
        return idfile;
    }

    /**
     * Sets the value of the idfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIDFILE(JAXBElement<BigDecimal> value) {
        this.idfile = value;
    }

    /**
     * Gets the value of the sig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getSIG() {
        return sig;
    }

    /**
     * Sets the value of the sig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setSIG(JAXBElement<byte[]> value) {
        this.sig = value;
    }

}
