
package com.chubb.workview.documentservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfQuotenumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfQuotenumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Quotenumber" type="{http://chubb.com/WorkView/DocumentService/2016/06}Quotenumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQuotenumber", propOrder = {
    "quotenumber"
})
public class ArrayOfQuotenumber {

    @XmlElement(name = "Quotenumber", nillable = true)
    protected List<Quotenumber> quotenumber;

    /**
     * Gets the value of the quotenumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotenumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotenumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Quotenumber }
     * 
     * 
     */
    public List<Quotenumber> getQuotenumber() {
        if (quotenumber == null) {
            quotenumber = new ArrayList<Quotenumber>();
        }
        return this.quotenumber;
    }

}