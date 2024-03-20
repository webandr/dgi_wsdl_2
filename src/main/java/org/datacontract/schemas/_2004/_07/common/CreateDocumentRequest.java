
package org.datacontract.schemas._2004._07.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreateDocumentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateDocumentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DATA_REGIS" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DOCUMENT_CID" type="{http://schemas.datacontract.org/2004/07/Common}ArrayOfCreateDocumentCID" minOccurs="0"/&gt;
 *         &lt;element name="DOCUMENT_FILES" type="{http://schemas.datacontract.org/2004/07/Common}ArrayOfCreateDocumentFile" minOccurs="0"/&gt;
 *         &lt;element name="DOCUMENT_OBJECT" type="{http://schemas.datacontract.org/2004/07/Common}ArrayOfCreateDocumentObject" minOccurs="0"/&gt;
 *         &lt;element name="DOCUMENT_SUBJECTS" type="{http://schemas.datacontract.org/2004/07/Common}ArrayOfCreateDocumentSubject" minOccurs="0"/&gt;
 *         &lt;element name="DOC_STATUS" type="{http://schemas.datacontract.org/2004/07/Common}DocStatus" minOccurs="0"/&gt;
 *         &lt;element name="DOLG_PODPISANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FIO_PODPISANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ISSUER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ORG_GUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_DATA_REGIS" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="P_REGISTR_N" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_TYPE_DOCUMENT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="REGISTR_N" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReonLayerObjectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "CreateDocumentRequest", propOrder = {
    "dataregis",
    "documentcid",
    "documentfiles",
    "documentobject",
    "documentsubjects",
    "docstatus",
    "dolgpodpisant",
    "fiopodpisant",
    "issuer",
    "orgguid",
    "pdataregis",
    "pregistrn",
    "ptypedocument",
    "registrn",
    "reonLayerObjectID",
    "typedocument"
})
public class CreateDocumentRequest {

    @XmlElement(name = "DATA_REGIS")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataregis;
    @XmlElementRef(name = "DOCUMENT_CID", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCreateDocumentCID> documentcid;
    @XmlElementRef(name = "DOCUMENT_FILES", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCreateDocumentFile> documentfiles;
    @XmlElementRef(name = "DOCUMENT_OBJECT", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCreateDocumentObject> documentobject;
    @XmlElementRef(name = "DOCUMENT_SUBJECTS", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCreateDocumentSubject> documentsubjects;
    @XmlElement(name = "DOC_STATUS")
    @XmlSchemaType(name = "string")
    protected DocStatus docstatus;
    @XmlElementRef(name = "DOLG_PODPISANT", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dolgpodpisant;
    @XmlElementRef(name = "FIO_PODPISANT", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fiopodpisant;
    @XmlElementRef(name = "ISSUER", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> issuer;
    @XmlElementRef(name = "ORG_GUID", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgguid;
    @XmlElement(name = "P_DATA_REGIS")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pdataregis;
    @XmlElementRef(name = "P_REGISTR_N", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pregistrn;
    @XmlElement(name = "P_TYPE_DOCUMENT")
    protected Integer ptypedocument;
    @XmlElementRef(name = "REGISTR_N", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrn;
    @XmlElementRef(name = "ReonLayerObjectID", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reonLayerObjectID;
    @XmlElement(name = "TYPE_DOCUMENT")
    protected Integer typedocument;

    /**
     * Gets the value of the dataregis property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAREGIS() {
        return dataregis;
    }

    /**
     * Sets the value of the dataregis property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAREGIS(XMLGregorianCalendar value) {
        this.dataregis = value;
    }

    /**
     * Gets the value of the documentcid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentCID }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCreateDocumentCID> getDOCUMENTCID() {
        return documentcid;
    }

    /**
     * Sets the value of the documentcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentCID }{@code >}
     *     
     */
    public void setDOCUMENTCID(JAXBElement<ArrayOfCreateDocumentCID> value) {
        this.documentcid = value;
    }

    /**
     * Gets the value of the documentfiles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentFile }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCreateDocumentFile> getDOCUMENTFILES() {
        return documentfiles;
    }

    /**
     * Sets the value of the documentfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentFile }{@code >}
     *     
     */
    public void setDOCUMENTFILES(JAXBElement<ArrayOfCreateDocumentFile> value) {
        this.documentfiles = value;
    }

    /**
     * Gets the value of the documentobject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentObject }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCreateDocumentObject> getDOCUMENTOBJECT() {
        return documentobject;
    }

    /**
     * Sets the value of the documentobject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentObject }{@code >}
     *     
     */
    public void setDOCUMENTOBJECT(JAXBElement<ArrayOfCreateDocumentObject> value) {
        this.documentobject = value;
    }

    /**
     * Gets the value of the documentsubjects property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentSubject }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCreateDocumentSubject> getDOCUMENTSUBJECTS() {
        return documentsubjects;
    }

    /**
     * Sets the value of the documentsubjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentSubject }{@code >}
     *     
     */
    public void setDOCUMENTSUBJECTS(JAXBElement<ArrayOfCreateDocumentSubject> value) {
        this.documentsubjects = value;
    }

    /**
     * Gets the value of the docstatus property.
     * 
     * @return
     *     possible object is
     *     {@link DocStatus }
     *     
     */
    public DocStatus getDOCSTATUS() {
        return docstatus;
    }

    /**
     * Sets the value of the docstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocStatus }
     *     
     */
    public void setDOCSTATUS(DocStatus value) {
        this.docstatus = value;
    }

    /**
     * Gets the value of the dolgpodpisant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDOLGPODPISANT() {
        return dolgpodpisant;
    }

    /**
     * Sets the value of the dolgpodpisant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOLGPODPISANT(JAXBElement<String> value) {
        this.dolgpodpisant = value;
    }

    /**
     * Gets the value of the fiopodpisant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFIOPODPISANT() {
        return fiopodpisant;
    }

    /**
     * Sets the value of the fiopodpisant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFIOPODPISANT(JAXBElement<String> value) {
        this.fiopodpisant = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getISSUER() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setISSUER(JAXBElement<String> value) {
        this.issuer = value;
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
     * Gets the value of the pdataregis property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPDATAREGIS() {
        return pdataregis;
    }

    /**
     * Sets the value of the pdataregis property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPDATAREGIS(XMLGregorianCalendar value) {
        this.pdataregis = value;
    }

    /**
     * Gets the value of the pregistrn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPREGISTRN() {
        return pregistrn;
    }

    /**
     * Sets the value of the pregistrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPREGISTRN(JAXBElement<String> value) {
        this.pregistrn = value;
    }

    /**
     * Gets the value of the ptypedocument property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPTYPEDOCUMENT() {
        return ptypedocument;
    }

    /**
     * Sets the value of the ptypedocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPTYPEDOCUMENT(Integer value) {
        this.ptypedocument = value;
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
     * Gets the value of the reonLayerObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReonLayerObjectID() {
        return reonLayerObjectID;
    }

    /**
     * Sets the value of the reonLayerObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReonLayerObjectID(JAXBElement<String> value) {
        this.reonLayerObjectID = value;
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
