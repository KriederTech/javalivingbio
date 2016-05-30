package com.gmg;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for personalinfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="personalinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firsName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="phonenumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personalinfo", propOrder = { "firsName", "lastName", "height",
		"weight", "age", "phonenumber", "email", "website", "birthdate",
		"gender" })
public class Personalinfo {

	@XmlElement(required = true)
	protected String firsName;
	@XmlElement(required = true)
	protected String lastName;
	protected Double height;
	protected Double weight;
	protected BigInteger age;
	protected String phonenumber;
	@XmlElement(required = true)
	protected String email;
	protected String website;
	protected String birthdate;
	protected String gender;

	/**
	 * Gets the value of the firsName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFirsName() {
		return firsName;
	}

	/**
	 * Sets the value of the firsName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFirsName(String value) {
		this.firsName = value;
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
	 * Gets the value of the height property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getHeight() {
		return height;
	}

	/**
	 * Sets the value of the height property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setHeight(Double value) {
		this.height = value;
	}

	/**
	 * Gets the value of the weight property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getWeight() {
		return weight;
	}

	/**
	 * Sets the value of the weight property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setWeight(Double value) {
		this.weight = value;
	}

	/**
	 * Gets the value of the age property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getAge() {
		return age;
	}

	/**
	 * Sets the value of the age property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setAge(BigInteger value) {
		this.age = value;
	}

	/**
	 * Gets the value of the phonenumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPhonenumber() {
		return phonenumber;
	}

	/**
	 * Sets the value of the phonenumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPhonenumber(String value) {
		this.phonenumber = value;
	}

	/**
	 * Gets the value of the email property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the value of the email property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEmail(String value) {
		this.email = value;
	}

	/**
	 * Gets the value of the website property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * Sets the value of the website property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWebsite(String value) {
		this.website = value;
	}

	/**
	 * Gets the value of the birthdate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBirthdate() {
		return birthdate;
	}

	/**
	 * Sets the value of the birthdate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBirthdate(String value) {
		this.birthdate = value;
	}

	/**
	 * Gets the value of the gender property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the value of the gender property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGender(String value) {
		this.gender = value;
	}

}
