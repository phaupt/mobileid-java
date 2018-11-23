
package org.etsi.uri.ts102204.v1_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://uri.etsi.org/TS102204/v1.1.2#}mssURIType"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{http://mss.ficom.fi/TS102204/v1.0.0#}UserLang"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalServiceType", propOrder = {
    "description",
    "userLangs"
})
public class AdditionalServiceType {

    @XmlElement(name = "Description", required = true)
    protected MssURIType description;
    @XmlElement(name = "UserLang", namespace = "http://mss.ficom.fi/TS102204/v1.0.0#", defaultValue = "de")
    protected List<String> userLangs;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link MssURIType }
     *     
     */
    public MssURIType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link MssURIType }
     *     
     */
    public void setDescription(MssURIType value) {
        this.description = value;
    }

    /**
     * Gets the value of the userLangs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userLangs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserLangs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUserLangs() {
        if (userLangs == null) {
            userLangs = new ArrayList<String>();
        }
        return this.userLangs;
    }

}
