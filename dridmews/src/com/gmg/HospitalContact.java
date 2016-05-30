package com.gmg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for HospitalContact complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="HospitalContact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hospital_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hospital_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hospital_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "HospitalContact", namespace = "http://services.gmg.com/MedicalContacts/1.0", propOrder = {
		"hospitalType", "hospitalName", "hospitalId", "address" })
public class HospitalContact {

	@XmlElement(name = "hospital_type", required = true)
	protected String hospitalType;
	@XmlElement(name = "hospital_name", required = true)
	protected String hospitalName;
	@XmlElement(name = "hospital_id", required = true)
	protected String hospitalId;
	protected Address address;

	/**
	 * Gets the value of the hospitalType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHospitalType() {
		return hospitalType;
	}

	/**
	 * Sets the value of the hospitalType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHospitalType(String value) {
		this.hospitalType = value;
	}

	/**
	 * Gets the value of the hospitalName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHospitalName() {
		return hospitalName;
	}

	/**
	 * Sets the value of the hospitalName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHospitalName(String value) {
		this.hospitalName = value;
	}

	/**
	 * Gets the value of the hospitalId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHospitalId() {
		return hospitalId;
	}

	/**
	 * Sets the value of the hospitalId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHospitalId(String value) {
		this.hospitalId = value;
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
