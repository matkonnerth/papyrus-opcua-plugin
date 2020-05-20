//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.20 at 09:01:50 AM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiagnosticsLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiagnosticsLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Basic_0"/>
 *     &lt;enumeration value="Advanced_1"/>
 *     &lt;enumeration value="Info_2"/>
 *     &lt;enumeration value="Log_3"/>
 *     &lt;enumeration value="Debug_4"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiagnosticsLevel")
@XmlEnum
public enum DiagnosticsLevel {

    @XmlEnumValue("Basic_0")
    BASIC_0("Basic_0"),
    @XmlEnumValue("Advanced_1")
    ADVANCED_1("Advanced_1"),
    @XmlEnumValue("Info_2")
    INFO_2("Info_2"),
    @XmlEnumValue("Log_3")
    LOG_3("Log_3"),
    @XmlEnumValue("Debug_4")
    DEBUG_4("Debug_4");
    private final String value;

    DiagnosticsLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiagnosticsLevel fromValue(String v) {
        for (DiagnosticsLevel c: DiagnosticsLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}