
package fi.ficom.mss.ts102204.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ch.swisscom.mid.ts102204.as.v1.SubscriberInfo;
import org.etsi.uri.ts102204.v1_1.MssURIType;


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
 *         &lt;element name="ServiceResponse" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Description" type="{http://uri.etsi.org/TS102204/v1.1.2#}mssURIType"/&gt;
 *                   &lt;element ref="{http://mid.swisscom.ch/TS102204/as/v1.0}SubscriberInfo" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "serviceResponses"
})
@XmlRootElement(name = "ServiceResponses")
public class ServiceResponses {

    @XmlElement(name = "ServiceResponse")
    protected List<ServiceResponses.ServiceResponse> serviceResponses;

    /**
     * Gets the value of the serviceResponses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceResponses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceResponses.ServiceResponse }
     * 
     * 
     */
    public List<ServiceResponses.ServiceResponse> getServiceResponses() {
        if (serviceResponses == null) {
            serviceResponses = new ArrayList<ServiceResponses.ServiceResponse>();
        }
        return this.serviceResponses;
    }


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
     *         &lt;element name="Description" type="{http://uri.etsi.org/TS102204/v1.1.2#}mssURIType"/&gt;
     *         &lt;element ref="{http://mid.swisscom.ch/TS102204/as/v1.0}SubscriberInfo" minOccurs="0"/&gt;
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
        "description",
        "subscriberInfo"
    })
    public static class ServiceResponse {

        @XmlElement(name = "Description", required = true)
        protected MssURIType description;
        @XmlElement(name = "SubscriberInfo", namespace = "http://mid.swisscom.ch/TS102204/as/v1.0")
        protected SubscriberInfo subscriberInfo;

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
         * Gets the value of the subscriberInfo property.
         * 
         * @return
         *     possible object is
         *     {@link SubscriberInfo }
         *     
         */
        public SubscriberInfo getSubscriberInfo() {
            return subscriberInfo;
        }

        /**
         * Sets the value of the subscriberInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubscriberInfo }
         *     
         */
        public void setSubscriberInfo(SubscriberInfo value) {
            this.subscriberInfo = value;
        }

    }

}
