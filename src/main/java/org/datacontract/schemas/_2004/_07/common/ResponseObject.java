
package org.datacontract.schemas._2004._07.common;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ADDR_BUILD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADDR_BUILD_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADDR_FIAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADDR_FIAS_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADDR_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CADNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FLAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID_ENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ID_OBJECT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TICKET" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="UNKV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UNOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USLNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseObject", propOrder = {
    "addrbuild",
    "addrbuildtext",
    "addrfias",
    "addrfiastext",
    "addrtext",
    "cadnum",
    "flat",
    "ident",
    "idobject",
    "npp",
    "ticket",
    "unkv",
    "unom",
    "uslnum"
})
public class ResponseObject {

    @XmlElementRef(name = "ADDR_BUILD", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addrbuild;
    @XmlElementRef(name = "ADDR_BUILD_TEXT", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addrbuildtext;
    @XmlElementRef(name = "ADDR_FIAS", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addrfias;
    @XmlElementRef(name = "ADDR_FIAS_TEXT", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addrfiastext;
    @XmlElementRef(name = "ADDR_TEXT", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addrtext;
    @XmlElementRef(name = "CADNUM", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cadnum;
    @XmlElementRef(name = "FLAT", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flat;
    @XmlElementRef(name = "ID_ENT", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ident;
    @XmlElementRef(name = "ID_OBJECT", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> idobject;
    @XmlElementRef(name = "NPP", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> npp;
    @XmlElementRef(name = "TICKET", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ticket;
    @XmlElementRef(name = "UNKV", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unkv;
    @XmlElementRef(name = "UNOM", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unom;
    @XmlElementRef(name = "USLNUM", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uslnum;

    /**
     * Gets the value of the addrbuild property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getADDRBUILD() {
        return addrbuild;
    }

    /**
     * Sets the value of the addrbuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setADDRBUILD(JAXBElement<String> value) {
        this.addrbuild = value;
    }

    /**
     * Gets the value of the addrbuildtext property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getADDRBUILDTEXT() {
        return addrbuildtext;
    }

    /**
     * Sets the value of the addrbuildtext property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setADDRBUILDTEXT(JAXBElement<String> value) {
        this.addrbuildtext = value;
    }

    /**
     * Gets the value of the addrfias property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getADDRFIAS() {
        return addrfias;
    }

    /**
     * Sets the value of the addrfias property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setADDRFIAS(JAXBElement<String> value) {
        this.addrfias = value;
    }

    /**
     * Gets the value of the addrfiastext property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getADDRFIASTEXT() {
        return addrfiastext;
    }

    /**
     * Sets the value of the addrfiastext property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setADDRFIASTEXT(JAXBElement<String> value) {
        this.addrfiastext = value;
    }

    /**
     * Gets the value of the addrtext property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getADDRTEXT() {
        return addrtext;
    }

    /**
     * Sets the value of the addrtext property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setADDRTEXT(JAXBElement<String> value) {
        this.addrtext = value;
    }

    /**
     * Gets the value of the cadnum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCADNUM() {
        return cadnum;
    }

    /**
     * Sets the value of the cadnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCADNUM(JAXBElement<String> value) {
        this.cadnum = value;
    }

    /**
     * Gets the value of the flat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFLAT() {
        return flat;
    }

    /**
     * Sets the value of the flat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFLAT(JAXBElement<String> value) {
        this.flat = value;
    }

    /**
     * Gets the value of the ident property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIDENT() {
        return ident;
    }

    /**
     * Sets the value of the ident property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIDENT(JAXBElement<BigDecimal> value) {
        this.ident = value;
    }

    /**
     * Gets the value of the idobject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIDOBJECT() {
        return idobject;
    }

    /**
     * Sets the value of the idobject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIDOBJECT(JAXBElement<BigDecimal> value) {
        this.idobject = value;
    }

    /**
     * Gets the value of the npp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNPP() {
        return npp;
    }

    /**
     * Sets the value of the npp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNPP(JAXBElement<String> value) {
        this.npp = value;
    }

    /**
     * Gets the value of the ticket property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTICKET() {
        return ticket;
    }

    /**
     * Sets the value of the ticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTICKET(JAXBElement<BigDecimal> value) {
        this.ticket = value;
    }

    /**
     * Gets the value of the unkv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUNKV() {
        return unkv;
    }

    /**
     * Sets the value of the unkv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUNKV(JAXBElement<String> value) {
        this.unkv = value;
    }

    /**
     * Gets the value of the unom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUNOM() {
        return unom;
    }

    /**
     * Sets the value of the unom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUNOM(JAXBElement<String> value) {
        this.unom = value;
    }

    /**
     * Gets the value of the uslnum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUSLNUM() {
        return uslnum;
    }

    /**
     * Sets the value of the uslnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUSLNUM(JAXBElement<String> value) {
        this.uslnum = value;
    }

}
