package com.gmg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for UserRequest complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="UserRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountinfo" type="{http://services.gmg.com/UserRequest/1.0}accountinfo"/>
 *         &lt;element name="addressinfo" type="{http://services.gmg.com/UserRequest/1.0}addressinfo" minOccurs="0"/>
 *         &lt;element name="personalinfo" type="{http://services.gmg.com/UserRequest/1.0}personalinfo"/>
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
@XmlType(name = "UserRequest", propOrder = { "username", "type", "accountinfo",
		"addressinfo", "personalinfo", "userId" })
public class UserRequest {

	@XmlElement(required = true)
	protected String username;
	@XmlElement(required = true)
	protected String type;
	@XmlElement(required = true)
	protected Accountinfo accountinfo;
	protected Addressinfo addressinfo;
	@XmlElement(required = true)
	protected Personalinfo personalinfo;
	@XmlElement(required = true)
	protected String userId;

	/**
	 * Gets the value of the username property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the value of the username property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUsername(String value) {
		this.username = value;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setType(String value) {
		this.type = value;
	}

	/**
	 * Gets the value of the accountinfo property.
	 * 
	 * @return possible object is {@link Accountinfo }
	 * 
	 */
	public Accountinfo getAccountinfo() {
		return accountinfo;
	}

	/**
	 * Sets the value of the accountinfo property.
	 * 
	 * @param value
	 *            allowed object is {@link Accountinfo }
	 * 
	 */
	public void setAccountinfo(Accountinfo value) {
		this.accountinfo = value;
	}

	/**
	 * Gets the value of the addressinfo property.
	 * 
	 * @return possible object is {@link Addressinfo }
	 * 
	 */
	public Addressinfo getAddressinfo() {
		return addressinfo;
	}

	/**
	 * Sets the value of the addressinfo property.
	 * 
	 * @param value
	 *            allowed object is {@link Addressinfo }
	 * 
	 */
	public void setAddressinfo(Addressinfo value) {
		this.addressinfo = value;
	}

	/**
	 * Gets the value of the personalinfo property.
	 * 
	 * @return possible object is {@link Personalinfo }
	 * 
	 */
	public Personalinfo getPersonalinfo() {
		return personalinfo;
	}

	/**
	 * Sets the value of the personalinfo property.
	 * 
	 * @param value
	 *            allowed object is {@link Personalinfo }
	 * 
	 */
	public void setPersonalinfo(Personalinfo value) {
		this.personalinfo = value;
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
