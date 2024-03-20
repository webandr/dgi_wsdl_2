
package org.datacontract.schemas._2004._07.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjectTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ЗУ"/&gt;
 *     &lt;enumeration value="Здание"/&gt;
 *     &lt;enumeration value="Помещение"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObjectTypes")
@XmlEnum
public enum ObjectTypes {

    ЗУ("\u0417\u0423"),
    @XmlEnumValue("\u0417\u0434\u0430\u043d\u0438\u0435")
    ЗДАНИЕ("\u0417\u0434\u0430\u043d\u0438\u0435"),
    @XmlEnumValue("\u041f\u043e\u043c\u0435\u0449\u0435\u043d\u0438\u0435")
    ПОМЕЩЕНИЕ("\u041f\u043e\u043c\u0435\u0449\u0435\u043d\u0438\u0435");
    private final String value;

    ObjectTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObjectTypes fromValue(String v) {
        for (ObjectTypes c: ObjectTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
