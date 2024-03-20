
package org.datacontract.schemas._2004._07.common;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseCID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseCID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DATAID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TAG_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseCID", propOrder = {
    "dataid",
    "tagname",
    "value"
})
public class ResponseCID {

    @XmlElementRef(name = "DATAID", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> dataid;
    @XmlElementRef(name = "TAG_NAME", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tagname;
    @XmlElementRef(name = "VALUE", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> value;

    /**
     * Gets the value of the dataid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDATAID() {
        return dataid;
    }

    /**
     * Sets the value of the dataid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDATAID(JAXBElement<BigDecimal> value) {
        this.dataid = value;
    }

    /**
     * Gets the value of the tagname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTAGNAME() {
        return tagname;
    }

    /**
     * Sets the value of the tagname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTAGNAME(JAXBElement<String> value) {
        this.tagname = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVALUE() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVALUE(JAXBElement<String> value) {
        this.value = value;
    }

}
