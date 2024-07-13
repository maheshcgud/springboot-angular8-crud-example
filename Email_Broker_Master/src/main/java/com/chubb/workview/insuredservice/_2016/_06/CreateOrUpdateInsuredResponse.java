
package com.chubb.workview.insuredservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreateOrUpdateInsuredResult" type="{http://Chubb.com/WorkView/InsuredService/2016/06}Response" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "createOrUpdateInsuredResult"
})
@XmlRootElement(name = "CreateOrUpdateInsuredResponse")
public class CreateOrUpdateInsuredResponse {

    @XmlElementRef(name = "CreateOrUpdateInsuredResult", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<Response> createOrUpdateInsuredResult;

    /**
     * Gets the value of the createOrUpdateInsuredResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Response }{@code >}
     *     
     */
    public JAXBElement<Response> getCreateOrUpdateInsuredResult() {
        return createOrUpdateInsuredResult;
    }

    /**
     * Sets the value of the createOrUpdateInsuredResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Response }{@code >}
     *     
     */
    public void setCreateOrUpdateInsuredResult(JAXBElement<Response> value) {
        this.createOrUpdateInsuredResult = value;
    }

}
