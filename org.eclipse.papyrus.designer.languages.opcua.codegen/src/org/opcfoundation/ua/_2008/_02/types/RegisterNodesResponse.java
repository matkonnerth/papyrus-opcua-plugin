//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.20 at 09:01:50 AM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterNodesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterNodesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ResponseHeader" minOccurs="0"/>
 *         &lt;element name="RegisteredNodeIds" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfNodeId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterNodesResponse", propOrder = {
    "responseHeader",
    "registeredNodeIds"
})
public class RegisterNodesResponse {

    @XmlElementRef(name = "ResponseHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ResponseHeader> responseHeader;
    @XmlElementRef(name = "RegisteredNodeIds", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfNodeId> registeredNodeIds;

    /**
     * Gets the value of the responseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResponseHeader }{@code >}
     *     
     */
    public JAXBElement<ResponseHeader> getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the value of the responseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResponseHeader }{@code >}
     *     
     */
    public void setResponseHeader(JAXBElement<ResponseHeader> value) {
        this.responseHeader = value;
    }

    /**
     * Gets the value of the registeredNodeIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfNodeId }{@code >}
     *     
     */
    public JAXBElement<ListOfNodeId> getRegisteredNodeIds() {
        return registeredNodeIds;
    }

    /**
     * Sets the value of the registeredNodeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfNodeId }{@code >}
     *     
     */
    public void setRegisteredNodeIds(JAXBElement<ListOfNodeId> value) {
        this.registeredNodeIds = value;
    }

}