
package org.datacontract.schemas._2004._07.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfResponseFiles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResponseFiles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseFiles" type="{http://schemas.datacontract.org/2004/07/Common}ResponseFiles" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResponseFiles", propOrder = {
    "responseFiles"
})
public class ArrayOfResponseFiles {

    @XmlElement(name = "ResponseFiles", nillable = true)
    protected List<ResponseFiles> responseFiles;

    /**
     * Gets the value of the responseFiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseFiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseFiles }
     * 
     * 
     */
    public List<ResponseFiles> getResponseFiles() {
        if (responseFiles == null) {
            responseFiles = new ArrayList<ResponseFiles>();
        }
        return this.responseFiles;
    }

}
