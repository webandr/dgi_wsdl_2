
package org.datacontract.schemas._2004._07.businesslogiclayer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFileResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFileResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService}BaseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID_DOC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ID_FILE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fileBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fileSig" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFileResponse", propOrder = {
    "iddoc",
    "idfile",
    "fileBytes",
    "fileName",
    "fileSig"
})
public class GetFileResponse
    extends BaseResponse
{

    @XmlElementRef(name = "ID_DOC", namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> iddoc;
    @XmlElementRef(name = "ID_FILE", namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idfile;
    @XmlElementRef(name = "fileBytes", namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> fileBytes;
    @XmlElementRef(name = "fileName", namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fileName;
    @XmlElementRef(name = "fileSig", namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> fileSig;

    /**
     * Gets the value of the iddoc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIDDOC() {
        return iddoc;
    }

    /**
     * Sets the value of the iddoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIDDOC(JAXBElement<Integer> value) {
        this.iddoc = value;
    }

    /**
     * Gets the value of the idfile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIDFILE() {
        return idfile;
    }

    /**
     * Sets the value of the idfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIDFILE(JAXBElement<Integer> value) {
        this.idfile = value;
    }

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
     * Gets the value of the fileSig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getFileSig() {
        return fileSig;
    }

    /**
     * Sets the value of the fileSig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setFileSig(JAXBElement<byte[]> value) {
        this.fileSig = value;
    }

}
