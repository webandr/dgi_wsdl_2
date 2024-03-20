
package org.datacontract.schemas._2004._07.businesslogiclayer;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ok"/&gt;
 *     &lt;enumeration value="error"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResponseStatus")
@XmlEnum
public enum ResponseStatus {

    @XmlEnumValue("ok")
    OK("ok"),
    @XmlEnumValue("error")
    ERROR("error");
    private final String value;

    ResponseStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponseStatus fromValue(String v) {
        for (ResponseStatus c: ResponseStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
