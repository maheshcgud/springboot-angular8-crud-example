package com.chubb.preprocessors.emailbrokermaster.jaxb.bodyxml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for anonymous complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}quote_number"/>
 *         &lt;element ref="{}ent_code"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"quoteNumber", "entCode"})
@XmlRootElement(name = "quote")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
public class Quote {

    @XmlElement(name = "quote_number", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String quoteNumber;
    @XmlElement(name = "ent_code", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String entCode;

    /**
     * Gets the value of the quoteNumber property.
     *
     * @return possible object is {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getQuoteNumber() {
        return quoteNumber;
    }

    /**
     * Sets the value of the quoteNumber property.
     *
     * @param value allowed object is {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setQuoteNumber(String value) {
        this.quoteNumber = value;
    }

    /**
     * Gets the value of the entCode property.
     *
     * @return possible object is {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getEntCode() {
        return entCode;
    }

    /**
     * Sets the value of the entCode property.
     *
     * @param value allowed object is {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEntCode(String value) {
        this.entCode = value;
    }

}
