
package org.datacontract.schemas._2004._07.businesslogiclayer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;


/**
 * <p>Java class for CreateDocumentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateDocumentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService}BaseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="filesId" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService}ResponseStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateDocumentResponse", propOrder = {
    "documentId",
    "filesId",
    "status"
})
public class CreateDocumentResponse
    extends BaseResponse
{

    @XmlElementRef(name = "documentId", namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> documentId;
    @XmlElementRef(name = "filesId", namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> filesId;
    @XmlSchemaType(name = "string")
    protected ResponseStatus status;

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDocumentId(JAXBElement<Long> value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the filesId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getFilesId() {
        return filesId;
    }

    /**
     * Sets the value of the filesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setFilesId(JAXBElement<ArrayOfint> value) {
        this.filesId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatus }
     *     
     */
    public ResponseStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatus }
     *     
     */
    public void setStatus(ResponseStatus value) {
        this.status = value;
    }

}
