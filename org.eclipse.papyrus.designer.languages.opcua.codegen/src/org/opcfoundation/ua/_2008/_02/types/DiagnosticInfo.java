//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.20 at 09:01:50 AM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiagnosticInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiagnosticInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SymbolicId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NamespaceUri" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Locale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LocalizedText" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InnerStatusCode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}StatusCode" minOccurs="0"/>
 *         &lt;element name="InnerDiagnosticInfo" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DiagnosticInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticInfo", propOrder = {
    "symbolicId",
    "namespaceUri",
    "locale",
    "localizedText",
    "additionalInfo",
    "innerStatusCode",
    "innerDiagnosticInfo"
})
public class DiagnosticInfo {

    @XmlElement(name = "SymbolicId")
    protected Integer symbolicId;
    @XmlElement(name = "NamespaceUri")
    protected Integer namespaceUri;
    @XmlElement(name = "Locale")
    protected Integer locale;
    @XmlElement(name = "LocalizedText")
    protected Integer localizedText;
    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;
    @XmlElement(name = "InnerStatusCode")
    protected StatusCode innerStatusCode;
    @XmlElement(name = "InnerDiagnosticInfo")
    protected DiagnosticInfo innerDiagnosticInfo;

    /**
     * Gets the value of the symbolicId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSymbolicId() {
        return symbolicId;
    }

    /**
     * Sets the value of the symbolicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSymbolicId(Integer value) {
        this.symbolicId = value;
    }

    /**
     * Gets the value of the namespaceUri property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNamespaceUri() {
        return namespaceUri;
    }

    /**
     * Sets the value of the namespaceUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNamespaceUri(Integer value) {
        this.namespaceUri = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocale(Integer value) {
        this.locale = value;
    }

    /**
     * Gets the value of the localizedText property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocalizedText() {
        return localizedText;
    }

    /**
     * Sets the value of the localizedText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalizedText(Integer value) {
        this.localizedText = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the innerStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCode }
     *     
     */
    public StatusCode getInnerStatusCode() {
        return innerStatusCode;
    }

    /**
     * Sets the value of the innerStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCode }
     *     
     */
    public void setInnerStatusCode(StatusCode value) {
        this.innerStatusCode = value;
    }

    /**
     * Gets the value of the innerDiagnosticInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticInfo }
     *     
     */
    public DiagnosticInfo getInnerDiagnosticInfo() {
        return innerDiagnosticInfo;
    }

    /**
     * Sets the value of the innerDiagnosticInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticInfo }
     *     
     */
    public void setInnerDiagnosticInfo(DiagnosticInfo value) {
        this.innerDiagnosticInfo = value;
    }

}