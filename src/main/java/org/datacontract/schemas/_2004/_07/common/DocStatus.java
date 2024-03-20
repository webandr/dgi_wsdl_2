
package org.datacontract.schemas._2004._07.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Действует"/&gt;
 *     &lt;enumeration value="НеДействует"/&gt;
 *     &lt;enumeration value="Архивный"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocStatus")
@XmlEnum
public enum DocStatus {

    @XmlEnumValue("\u0414\u0435\u0439\u0441\u0442\u0432\u0443\u0435\u0442")
    ДЕЙСТВУЕТ("\u0414\u0435\u0439\u0441\u0442\u0432\u0443\u0435\u0442"),
    @XmlEnumValue("\u041d\u0435\u0414\u0435\u0439\u0441\u0442\u0432\u0443\u0435\u0442")
    НЕ_ДЕЙСТВУЕТ("\u041d\u0435\u0414\u0435\u0439\u0441\u0442\u0432\u0443\u0435\u0442"),
    @XmlEnumValue("\u0410\u0440\u0445\u0438\u0432\u043d\u044b\u0439")
    АРХИВНЫЙ("\u0410\u0440\u0445\u0438\u0432\u043d\u044b\u0439");
    private final String value;

    DocStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocStatus fromValue(String v) {
        for (DocStatus c: DocStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
