package com.gmg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for accountinfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="accountinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountexpired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="accountlocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="credentialsexpired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="accountenabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="accountid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountinfo", propOrder = { "accountexpired", "accountlocked",
		"credentialsexpired", "accountenabled", "accountid" })
public class Accountinfo {

	protected boolean accountexpired;
	protected boolean accountlocked;
	protected Boolean credentialsexpired;
	protected boolean accountenabled;
	@XmlElement(required = true)
	protected String accountid;

	/**
	 * Gets the value of the accountexpired property.
	 * 
	 */
	public boolean isAccountexpired() {
		return accountexpired;
	}

	/**
	 * Sets the value of the accountexpired property.
	 * 
	 */
	public void setAccountexpired(boolean value) {
		this.accountexpired = value;
	}

	/**
	 * Gets the value of the accountlocked property.
	 * 
	 */
	public boolean isAccountlocked() {
		return accountlocked;
	}

	/**
	 * Sets the value of the accountlocked property.
	 * 
	 */
	public void setAccountlocked(boolean value) {
		this.accountlocked = value;
	}

	/**
	 * Gets the value of the credentialsexpired property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isCredentialsexpired() {
		return credentialsexpired;
	}

	/**
	 * Sets the value of the credentialsexpired property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setCredentialsexpired(Boolean value) {
		this.credentialsexpired = value;
	}

	/**
	 * Gets the value of the accountenabled property.
	 * 
	 */
	public boolean isAccountenabled() {
		return accountenabled;
	}

	/**
	 * Sets the value of the accountenabled property.
	 * 
	 */
	public void setAccountenabled(boolean value) {
		this.accountenabled = value;
	}

	/**
	 * Gets the value of the accountid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAccountid() {
		return accountid;
	}

	/**
	 * Sets the value of the accountid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAccountid(String value) {
		this.accountid = value;
	}

}
