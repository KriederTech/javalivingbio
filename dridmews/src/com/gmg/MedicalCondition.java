package com.gmg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for MedicalCondition complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="MedicalCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="condition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="onset" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicalCondition", namespace = "http://services.gmg.com/MedicalConditions/1.0", propOrder = {
		"condition", "status", "onset", "details", "id" })
public class MedicalCondition {

	@XmlElement(required = true)
	protected String condition;
	@XmlElement(required = true)
	protected String status;
	@XmlElement(required = true)
	protected String onset;
	@XmlElement(required = true)
	protected String details;
	@XmlElement(required = true)
	protected String id;

	/**
	 * Gets the value of the condition property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * Sets the value of the condition property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCondition(String value) {
		this.condition = value;
	}

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStatus(String value) {
		this.status = value;
	}

	/**
	 * Gets the value of the onset property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOnset() {
		return onset;
	}

	/**
	 * Sets the value of the onset property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOnset(String value) {
		this.onset = value;
	}

	/**
	 * Gets the value of the details property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * Sets the value of the details property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDetails(String value) {
		this.details = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

}
