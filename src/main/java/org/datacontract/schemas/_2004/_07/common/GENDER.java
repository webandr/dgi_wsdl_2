
package org.datacontract.schemas._2004._07.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GENDER.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GENDER"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="М"/&gt;
 *     &lt;enumeration value="Ж"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GENDER")
@XmlEnum
public enum GENDER {

    М,
    Ж;

    public String value() {
        return name();
    }

    public static GENDER fromValue(String v) {
        return valueOf(v);
    }

}
