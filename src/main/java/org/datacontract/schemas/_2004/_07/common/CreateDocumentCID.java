
package org.datacontract.schemas._2004._07.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateDocumentCID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateDocumentCID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BLOCKID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PARENT_TAG_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TAG_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TAG_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateDocumentCID", propOrder = {
    "blockid",
    "parenttagname",
    "tagname",
    "tagvalue"
})
public class CreateDocumentCID {

    @XmlElement(name = "BLOCKID")
    protected Integer blockid;
    @XmlElementRef(name = "PARENT_TAG_NAME", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parenttagname;
    @XmlElementRef(name = "TAG_NAME", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tagname;
    @XmlElementRef(name = "TAG_VALUE", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tagvalue;

    /**
     * Gets the value of the blockid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBLOCKID() {
        return blockid;
    }

    /**
     * Sets the value of the blockid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBLOCKID(Integer value) {
        this.blockid = value;
    }

    /**
     * Gets the value of the parenttagname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPARENTTAGNAME() {
        return parenttagname;
    }

    /**
     * Sets the value of the parenttagname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPARENTTAGNAME(JAXBElement<String> value) {
        this.parenttagname = value;
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
     * Gets the value of the tagvalue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTAGVALUE() {
        return tagvalue;
    }

    /**
     * Sets the value of the tagvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTAGVALUE(JAXBElement<String> value) {
        this.tagvalue = value;
    }

}
