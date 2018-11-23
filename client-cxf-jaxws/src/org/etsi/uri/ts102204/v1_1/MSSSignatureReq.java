
package org.etsi.uri.ts102204.v1_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MSS_SignatureReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MSS_SignatureReqType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://uri.etsi.org/TS102204/v1.1.2#}MessageAbstractType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MobileUser" type="{http://uri.etsi.org/TS102204/v1.1.2#}MobileUserType"/&gt;
 *         &lt;element name="DataToBeSigned" type="{http://uri.etsi.org/TS102204/v1.1.2#}DataType"/&gt;
 *         &lt;element name="SignatureProfile" type="{http://uri.etsi.org/TS102204/v1.1.2#}mssURIType" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalServices" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Service" type="{http://uri.etsi.org/TS102204/v1.1.2#}AdditionalServiceType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TimeOut" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="MessagingMode" use="required" type="{http://uri.etsi.org/TS102204/v1.1.2#}MessagingModeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSS_SignatureReqType", propOrder = {
    "mobileUser",
    "dataToBeSigned",
    "signatureProfile",
    "additionalServices"
})
@XmlRootElement(name = "MSS_SignatureReq")
public class MSSSignatureReq
    extends MessageAbstractType
{

    @XmlElement(name = "MobileUser", required = true)
    protected MobileUserType mobileUser;
    @XmlElement(name = "DataToBeSigned", required = true)
    protected DataType dataToBeSigned;
    @XmlElement(name = "SignatureProfile")
    protected MssURIType signatureProfile;
    @XmlElement(name = "AdditionalServices")
    protected MSSSignatureReq.AdditionalServices additionalServices;
    @XmlAttribute(name = "TimeOut")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger timeOut;
    @XmlAttribute(name = "MessagingMode", required = true)
    protected MessagingModeType messagingMode;

    /**
     * Gets the value of the mobileUser property.
     * 
     * @return
     *     possible object is
     *     {@link MobileUserType }
     *     
     */
    public MobileUserType getMobileUser() {
        return mobileUser;
    }

    /**
     * Sets the value of the mobileUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileUserType }
     *     
     */
    public void setMobileUser(MobileUserType value) {
        this.mobileUser = value;
    }

    /**
     * Gets the value of the dataToBeSigned property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getDataToBeSigned() {
        return dataToBeSigned;
    }

    /**
     * Sets the value of the dataToBeSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setDataToBeSigned(DataType value) {
        this.dataToBeSigned = value;
    }

    /**
     * Gets the value of the signatureProfile property.
     * 
     * @return
     *     possible object is
     *     {@link MssURIType }
     *     
     */
    public MssURIType getSignatureProfile() {
        return signatureProfile;
    }

    /**
     * Sets the value of the signatureProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link MssURIType }
     *     
     */
    public void setSignatureProfile(MssURIType value) {
        this.signatureProfile = value;
    }

    /**
     * Gets the value of the additionalServices property.
     * 
     * @return
     *     possible object is
     *     {@link MSSSignatureReq.AdditionalServices }
     *     
     */
    public MSSSignatureReq.AdditionalServices getAdditionalServices() {
        return additionalServices;
    }

    /**
     * Sets the value of the additionalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSSSignatureReq.AdditionalServices }
     *     
     */
    public void setAdditionalServices(MSSSignatureReq.AdditionalServices value) {
        this.additionalServices = value;
    }

    /**
     * Gets the value of the timeOut property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeOut() {
        return timeOut;
    }

    /**
     * Sets the value of the timeOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeOut(BigInteger value) {
        this.timeOut = value;
    }

    /**
     * Gets the value of the messagingMode property.
     * 
     * @return
     *     possible object is
     *     {@link MessagingModeType }
     *     
     */
    public MessagingModeType getMessagingMode() {
        return messagingMode;
    }

    /**
     * Sets the value of the messagingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessagingModeType }
     *     
     */
    public void setMessagingMode(MessagingModeType value) {
        this.messagingMode = value;
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
     *         &lt;element name="Service" type="{http://uri.etsi.org/TS102204/v1.1.2#}AdditionalServiceType" maxOccurs="unbounded"/&gt;
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
        "services"
    })
    public static class AdditionalServices {

        @XmlElement(name = "Service", required = true)
        protected List<AdditionalServiceType> services;

        /**
         * Gets the value of the services property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the services property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServices().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AdditionalServiceType }
         * 
         * 
         */
        public List<AdditionalServiceType> getServices() {
            if (services == null) {
                services = new ArrayList<AdditionalServiceType>();
            }
            return this.services;
        }

    }

}
