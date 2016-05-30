package com.gmg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for DeleteMedicalConditionRequest complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteMedicalConditionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MedicalConditions" type="{http://services.gmg.com/MedicalConditions/1.0}MedicalConditions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteMedicalConditionRequest", namespace = "http://services.gmg.com/DeleteMedicalConditionRequest/1.0", propOrder = { "medicalConditions" })
public class DeleteMedicalConditionRequest {

	@XmlElement(name = "MedicalConditions", required = true)
	protected MedicalConditions medicalConditions;

	/**
	 * Gets the value of the medicalConditions property.
	 * 
	 * @return possible object is {@link MedicalConditions }
	 * 
	 */
	public MedicalConditions getMedicalConditions() {
		return medicalConditions;
	}

	/**
	 * Sets the value of the medicalConditions property.
	 * 
	 * @param value
	 *            allowed object is {@link MedicalConditions }
	 * 
	 */
	public void setMedicalConditions(MedicalConditions value) {
		this.medicalConditions = value;
	}

}
