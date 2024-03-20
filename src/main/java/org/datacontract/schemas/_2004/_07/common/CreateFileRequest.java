
package org.datacontract.schemas._2004._07.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateFileRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateFileRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FileBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="FileDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdDocumentRes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "CreateFileRequest", propOrder = {
    "fileBytes",
    "fileDescr",
    "fileName",
    "idDocumentRes",
    "orgguid",
    "typedocument"
})
public class CreateFileRequest {

    @XmlElementRef(name = "FileBytes", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> fileBytes;
    @XmlElementRef(name = "FileDescr", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fileDescr;
    @XmlElementRef(name = "FileName", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fileName;
    @XmlElementRef(name = "IdDocumentRes", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idDocumentRes;
    @XmlElementRef(name = "ORG_GUID", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgguid;
    @XmlElement(name = "TYPE_DOCUMENT")
    protected Integer typedocument;

    /**
     * Gets the value of the fileBytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getFileBytes() {
        return fileBytes;
    }

    /**
     * Sets the value of the fileBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setFileBytes(JAXBElement<byte[]> value) {
        this.fileBytes = value;
    }

    /**
     * Gets the value of the fileDescr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileDescr() {
        return fileDescr;
    }

    /**
     * Sets the value of the fileDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileDescr(JAXBElement<String> value) {
        this.fileDescr = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileName(JAXBElement<String> value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the idDocumentRes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdDocumentRes() {
        return idDocumentRes;
    }

    /**
     * Sets the value of the idDocumentRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdDocumentRes(JAXBElement<Integer> value) {
        this.idDocumentRes = value;
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
