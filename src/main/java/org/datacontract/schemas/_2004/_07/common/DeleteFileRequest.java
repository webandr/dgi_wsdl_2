
package org.datacontract.schemas._2004._07.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteFileRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteFileRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdDocumentRes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdFile" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ORG_GUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TYPE_DOCUMENT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteFileRequest", propOrder = {
    "idDocumentRes",
    "idFile",
    "orgguid",
    "typedocument"
})
public class DeleteFileRequest {

    @XmlElement(name = "IdDocumentRes")
    protected Integer idDocumentRes;
    @XmlElement(name = "IdFile")
    protected Integer idFile;
    @XmlElementRef(name = "ORG_GUID", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgguid;
    @XmlElement(name = "TYPE_DOCUMENT")
    protected Integer typedocument;

    /**
     * Gets the value of the idDocumentRes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdDocumentRes() {
        return idDocumentRes;
    }

    /**
     * Sets the value of the idDocumentRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdDocumentRes(Integer value) {
        this.idDocumentRes = value;
    }

    /**
     * Gets the value of the idFile property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdFile() {
        return idFile;
    }

    /**
     * Sets the value of the idFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdFile(Integer value) {
        this.idFile = value;
    }

    /**
     * Gets the value of the orgguid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getORGGUID() {
        return orgguid;
    }

    /**
     * Sets the value of the orgguid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setORGGUID(JAXBElement<String> value) {
        this.orgguid = value;
    }

    /**
     * Gets the value of the typedocument property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTYPEDOCUMENT() {
        return typedocument;
    }

    /**
     * Sets the value of the typedocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTYPEDOCUMENT(Integer value) {
        this.typedocument = value;
    }

}
