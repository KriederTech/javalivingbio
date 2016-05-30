package com.gmg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for UpdateMedicalContactRequest complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateMedicalContactRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MedicalContacts" type="{http://services.gmg.com/MedicalContacts/1.0}MedicalContacts"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateMedicalContactRequest", namespace = "http://services.gmg.com/UpdateMedicalContactRequest/1.0", propOrder = { "medicalContacts" })
public class UpdateMedicalContactRequest {

	@XmlElement(name = "MedicalContacts", required = true)
	protected MedicalContacts medicalContacts;

	/**
	 * Gets the value of the medicalContacts property.
	 * 
	 * @return possible object is {@link MedicalContacts }
	 * 
	 */
	public MedicalContacts getMedicalContacts() {
		return medicalContacts;
	}

	/**
	 * Sets the value of the medicalContacts property.
	 * 
	 * @param value
	 *            allowed object is {@link MedicalContacts }
	 * 
	 */
	public void setMedicalContacts(MedicalContacts value) {
		this.medicalContacts = value;
	}

}
