
package org.datacontract.schemas._2004._07.businesslogiclayer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService}BaseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CADNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DATA_REGIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REGISTR_N" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TYPE_DOCUMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UNOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USLNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentRequest", propOrder = {
    "cadnum",
    "dataregis",
    "registrn",
    "typedocument",
    "unom",
    "uslnum"
})
public class DocumentRequest
    extends BaseRequest
{

    @XmlElementRef(name = "CADNUM", namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cadnum;
    @XmlElementRef(name = "DATA_REGIS", namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataregis;
    @XmlElementRef(name = "REGISTR_N", namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrn;
    @XmlElementRef(name = "TYPE_DOCUMENT", namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typedocument;
    @XmlElementRef(name = "UNOM", namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unom;
    @XmlElementRef(name = "USLNUM", namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uslnum;

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
     * Gets the value of the dataregis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDATAREGIS() {
        return dataregis;
    }

    /**
     * Sets the value of the dataregis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDATAREGIS(JAXBElement<String> value) {
        this.dataregis = value;
    }

    /**
     * Gets the value of the registrn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREGISTRN() {
        return registrn;
    }

    /**
     * Sets the value of the registrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREGISTRN(JAXBElement<String> value) {
        this.registrn = value;
    }

    /**
     * Gets the value of the typedocument property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTYPEDOCUMENT() {
        return typedocument;
    }

    /**
     * Sets the value of the typedocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTYPEDOCUMENT(JAXBElement<String> value) {
        this.typedocument = value;
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
