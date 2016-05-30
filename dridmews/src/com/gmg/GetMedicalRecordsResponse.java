package com.gmg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for GetMedicalRecordsResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="GetMedicalRecordsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MedicalRecords" type="{http://services.gmg.com/MedicalRecords/1.0}MedicalRecords"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMedicalRecordsResponse", namespace = "http://services.gmg.com/GetMedicalRecordsResponse/1.0", propOrder = { "medicalRecords" })
public class GetMedicalRecordsResponse {

	@XmlElement(name = "MedicalRecords", required = true)
	protected MedicalRecords medicalRecords;

	/**
	 * Gets the value of the medicalRecords property.
	 * 
	 * @return possible object is {@link MedicalRecords }
	 * 
	 */
	public MedicalRecords getMedicalRecords() {
		return medicalRecords;
	}

	/**
	 * Sets the value of the medicalRecords property.
	 * 
	 * @param value
	 *            allowed object is {@link MedicalRecords }
	 * 
	 */
	public void setMedicalRecords(MedicalRecords value) {
		this.medicalRecords = value;
	}

}
