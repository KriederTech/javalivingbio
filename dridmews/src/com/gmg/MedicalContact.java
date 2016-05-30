package com.gmg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for MedicalContact complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="MedicalContact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="first_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doctor_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doctor_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{http://services.gmg.com/MedicalContacts/1.0}address" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicalContact", namespace = "http://services.gmg.com/MedicalContacts/1.0", propOrder = {
		"firstName", "lastName", "doctorType", "doctorId", "address" })
public class MedicalContact {

	@XmlElement(name = "first_name", required = true)
	protected String firstName;
	@XmlElement(name = "last_name", required = true)
	protected String lastName;
	@XmlElement(name = "doctor_type", required = true)
	protected String doctorType;
	@XmlElement(name = "doctor_id", required = true)
	protected String doctorId;
	protected Address address;

	/**
	 * Gets the value of the firstName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the value of the firstName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFirstName(String value) {
		this.firstName = value;
	}

	/**
	 * Gets the value of the lastName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the value of the lastName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLastName(String value) {
		this.lastName = value;
	}

	/**
	 * Gets the value of the doctorType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDoctorType() {
		return doctorType;
	}

	/**
	 * Sets the value of the doctorType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDoctorType(String value) {
		this.doctorType = value;
	}

	/**
	 * Gets the value of the doctorId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDoctorId() {
		return doctorId;
	}

	/**
	 * Sets the value of the doctorId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDoctorId(String value) {
		this.doctorId = value;
	}

	/**
	 * Gets the value of the address property.
	 * 
	 * @return possible object is {@link Address }
	 * 
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * Sets the value of the address property.
	 * 
	 * @param value
	 *            allowed object is {@link Address }
	 * 
	 */
	public void setAddress(Address value) {
		this.address = value;
	}

}
