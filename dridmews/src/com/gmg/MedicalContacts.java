package com.gmg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for MedicalContacts complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="MedicalContacts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MedicalContact" type="{http://services.gmg.com/MedicalContacts/1.0}MedicalContact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HospitalContact" type="{http://services.gmg.com/MedicalContacts/1.0}HospitalContact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicalContacts", namespace = "http://services.gmg.com/MedicalContacts/1.0", propOrder = {
		"medicalContact", "hospitalContact", "userId" })
public class MedicalContacts {

	@XmlElement(name = "MedicalContact")
	protected List<MedicalContact> medicalContact;
	@XmlElement(name = "HospitalContact")
	protected List<HospitalContact> hospitalContact;
	@XmlElement(required = true)
	protected String userId;

	/**
	 * Gets the value of the medicalContact property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the medicalContact property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getMedicalContact().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link MedicalContact }
	 * 
	 * 
	 */
	public List<MedicalContact> getMedicalContact() {
		if (medicalContact == null) {
			medicalContact = new ArrayList<MedicalContact>();
		}
		return this.medicalContact;
	}

	/**
	 * Gets the value of the hospitalContact property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the hospitalContact property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getHospitalContact().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link HospitalContact }
	 * 
	 * 
	 */
	public List<HospitalContact> getHospitalContact() {
		if (hospitalContact == null) {
			hospitalContact = new ArrayList<HospitalContact>();
		}
		return this.hospitalContact;
	}

	/**
	 * Gets the value of the userId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * Sets the value of the userId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserId(String value) {
		this.userId = value;
	}

}
