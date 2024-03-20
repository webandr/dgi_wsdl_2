
package org.datacontract.schemas._2004._07.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateDocumentObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateDocumentObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ADDR_BUILD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADDR_FIAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADDR_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CADNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FLAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID_ENT" type="{http://schemas.datacontract.org/2004/07/Common}ObjectTypes" minOccurs="0"/&gt;
 *         &lt;element name="NPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "CreateDocumentObject", propOrder = {
    "addrbuild",
    "addrfias",
    "addrtext",
    "cadnum",
    "flat",
    "ident",
    "npp",
    "unkv",
    "unom",
    "uslnum"
})
public class CreateDocumentObject {

    @XmlElementRef(name = "ADDR_BUILD", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addrbuild;
    @XmlElementRef(name = "ADDR_FIAS", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addrfias;
    @XmlElementRef(name = "ADDR_TEXT", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addrtext;
    @XmlElementRef(name = "CADNUM", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cadnum;
    @XmlElementRef(name = "FLAT", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flat;
    @XmlElement(name = "ID_ENT")
    @XmlSchemaType(name = "string")
    protected ObjectTypes ident;
    @XmlElementRef(name = "NPP", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> npp;
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
     *     {@link ObjectTypes }
     *     
     */
    public ObjectTypes getIDENT() {
        return ident;
    }

    /**
     * Sets the value of the ident property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectTypes }
     *     
     */
    public void setIDENT(ObjectTypes value) {
        this.ident = value;
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
