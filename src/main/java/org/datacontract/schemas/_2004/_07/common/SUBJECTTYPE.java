
package org.datacontract.schemas._2004._07.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBJECTTYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SUBJECTTYPE"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ФизЛицо"/&gt;
 *     &lt;enumeration value="ЮрЛицо"/&gt;
 *     &lt;enumeration value="ИП"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SUBJECTTYPE")
@XmlEnum
public enum SUBJECTTYPE {

    @XmlEnumValue("\u0424\u0438\u0437\u041b\u0438\u0446\u043e")
    ФИЗ_ЛИЦО("\u0424\u0438\u0437\u041b\u0438\u0446\u043e"),
    @XmlEnumValue("\u042e\u0440\u041b\u0438\u0446\u043e")
    ЮР_ЛИЦО("\u042e\u0440\u041b\u0438\u0446\u043e"),
    ИП("\u0418\u041f");
    private final String value;

    SUBJECTTYPE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SUBJECTTYPE fromValue(String v) {
        for (SUBJECTTYPE c: SUBJECTTYPE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
