
package org.datacontract.schemas._2004._07.common;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetChangesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetChangesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CREATEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DATA_REGIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOCUMENT_CID" type="{http://schemas.datacontract.org/2004/07/Common}ArrayOfResponseCID" minOccurs="0"/&gt;
 *         &lt;element name="DOCUMENT_FILES" type="{http://schemas.datacontract.org/2004/07/Common}ArrayOfResponseFiles" minOccurs="0"/&gt;
 *         &lt;element name="DOCUMENT_OBJECT" type="{http://schemas.datacontract.org/2004/07/Common}ArrayOfResponseObject" minOccurs="0"/&gt;
 *         &lt;element name="DOCUMENT_SUBJECTS" type="{http://schemas.datacontract.org/2004/07/Common}ArrayOfResponseSubject" minOccurs="0"/&gt;
 *         &lt;element name="DOLG_PODPISANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FIO_PODPISANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID_DOCUMENTRES" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ID_PARENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ISSUER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ORG_GUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REGISTR_N" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SIGNDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TYPE_DOCUMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TYPE_DOCUMENT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TYPE_DOCUMENT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetChangesResponse", propOrder = {
    "createdate",
    "dataregis",
    "documentcid",
    "documentfiles",
    "documentobject",
    "documentsubjects",
    "dolgpodpisant",
    "fiopodpisant",
    "iddocumentres",
    "idparent",
    "issuer",
    "orgguid",
    "registrn",
    "signdate",
    "status",
    "typedocument",
    "typedocument2",
    "typedocument3"
})
public class GetChangesResponse {

    @XmlElementRef(name = "CREATEDATE", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdate;
    @XmlElementRef(name = "DATA_REGIS", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataregis;
    @XmlElementRef(name = "DOCUMENT_CID", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResponseCID> documentcid;
    @XmlElementRef(name = "DOCUMENT_FILES", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResponseFiles> documentfiles;
    @XmlElementRef(name = "DOCUMENT_OBJECT", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResponseObject> documentobject;
    @XmlElementRef(name = "DOCUMENT_SUBJECTS", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResponseSubject> documentsubjects;
    @XmlElementRef(name = "DOLG_PODPISANT", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dolgpodpisant;
    @XmlElementRef(name = "FIO_PODPISANT", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fiopodpisant;
    @XmlElementRef(name = "ID_DOCUMENTRES", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> iddocumentres;
    @XmlElementRef(name = "ID_PARENT", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> idparent;
    @XmlElementRef(name = "ISSUER", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> issuer;
    @XmlElementRef(name = "ORG_GUID", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgguid;
    @XmlElementRef(name = "REGISTR_N", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrn;
    @XmlElementRef(name = "SIGNDATE", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> signdate;
    @XmlElementRef(name = "STATUS", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> status;
    @XmlElementRef(name = "TYPE_DOCUMENT", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typedocument;
    @XmlElementRef(name = "TYPE_DOCUMENT2", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typedocument2;
    @XmlElementRef(name = "TYPE_DOCUMENT3", namespace = "http://schemas.datacontract.org/2004/07/Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typedocument3;

    /**
     * Gets the value of the createdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCREATEDATE() {
        return createdate;
    }

    /**
     * Sets the value of the createdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCREATEDATE(JAXBElement<String> value) {
        this.createdate = value;
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
     * Gets the value of the documentcid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResponseCID }{@code >}
     *     
     */
    public JAXBElement<ArrayOfResponseCID> getDOCUMENTCID() {
        return documentcid;
    }

    /**
     * Sets the value of the documentcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResponseCID }{@code >}
     *     
     */
    public void setDOCUMENTCID(JAXBElement<ArrayOfResponseCID> value) {
        this.documentcid = value;
    }

    /**
     * Gets the value of the documentfiles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResponseFiles }{@code >}
     *     
     */
    public JAXBElement<ArrayOfResponseFiles> getDOCUMENTFILES() {
        return documentfiles;
    }

    /**
     * Sets the value of the documentfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResponseFiles }{@code >}
     *     
     */
    public void setDOCUMENTFILES(JAXBElement<ArrayOfResponseFiles> value) {
        this.documentfiles = value;
    }

    /**
     * Gets the value of the documentobject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResponseObject }{@code >}
     *     
     */
    public JAXBElement<ArrayOfResponseObject> getDOCUMENTOBJECT() {
        return documentobject;
    }

    /**
     * Sets the value of the documentobject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResponseObject }{@code >}
     *     
     */
    public void setDOCUMENTOBJECT(JAXBElement<ArrayOfResponseObject> value) {
        this.documentobject = value;
    }

    /**
     * Gets the value of the documentsubjects property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResponseSubject }{@code >}
     *     
     */
    public JAXBElement<ArrayOfResponseSubject> getDOCUMENTSUBJECTS() {
        return documentsubjects;
    }

    /**
     * Sets the value of the documentsubjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResponseSubject }{@code >}
     *     
     */
    public void setDOCUMENTSUBJECTS(JAXBElement<ArrayOfResponseSubject> value) {
        this.documentsubjects = value;
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
     * Gets the value of the iddocumentres property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIDDOCUMENTRES() {
        return iddocumentres;
    }

    /**
     * Sets the value of the iddocumentres property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIDDOCUMENTRES(JAXBElement<BigDecimal> value) {
        this.iddocumentres = value;
    }

    /**
     * Gets the value of the idparent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIDPARENT() {
        return idparent;
    }

    /**
     * Sets the value of the idparent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIDPARENT(JAXBElement<BigDecimal> value) {
        this.idparent = value;
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
     * Gets the value of the signdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSIGNDATE() {
        return signdate;
    }

    /**
     * Sets the value of the signdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSIGNDATE(JAXBElement<String> value) {
        this.signdate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSTATUS(JAXBElement<BigDecimal> value) {
        this.status = value;
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
     * Gets the value of the typedocument2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTYPEDOCUMENT2() {
        return typedocument2;
    }

    /**
     * Sets the value of the typedocument2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTYPEDOCUMENT2(JAXBElement<String> value) {
        this.typedocument2 = value;
    }

    /**
     * Gets the value of the typedocument3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTYPEDOCUMENT3() {
        return typedocument3;
    }

    /**
     * Sets the value of the typedocument3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTYPEDOCUMENT3(JAXBElement<String> value) {
        this.typedocument3 = value;
    }

}
