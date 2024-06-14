//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.01 at 05:13:04 AM GMT 
//


package com.chubb.preprocessors.emailbrokermaster.jaxb.Indexxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}bpu_code"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="error_queue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="queue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}document" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bpuCode",
    "errorQueue",
    "queue",
    "document"
})
@XmlRootElement(name = "index_envelope")
public class IndexType {

    @XmlElement(name = "bpu_code", required = true)
    protected String bpuCode;
    @XmlElement(name = "error_queue")
    protected String errorQueue;
    protected String queue;
    @XmlElement(required = true)
    protected List<Document> document;

    /**
     * Gets the value of the bpuCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpuCode() {
        return bpuCode;
    }

    /**
     * Sets the value of the bpuCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpuCode(String value) {
        this.bpuCode = value;
    }

    /**
     * Gets the value of the errorQueue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorQueue() {
        return errorQueue;
    }

    /**
     * Sets the value of the errorQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorQueue(String value) {
        this.errorQueue = value;
    }

    /**
     * Gets the value of the queue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueue() {
        return queue;
    }

    /**
     * Sets the value of the queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueue(String value) {
        this.queue = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document }
     * 
     * 
     */
    public List<Document> getDocument() {
        if (document == null) {
            document = new ArrayList<Document>();
        }
        return this.document;
    }

}