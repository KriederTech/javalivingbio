
package com.gmg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ResetPasswordResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ResetPasswordResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tmp_password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResetPasswordResponse", namespace = "http://piglet.healthcodex.com/ResetPasswordResponse/1.0", propOrder = {
		"response", "email", "tmpPassword" })
public class ResetPasswordResponse {

	@XmlElement(required = true)
	protected String response;
	@XmlElement(required = true)
	protected String email;
	@XmlElement(name = "tmp_password", required = true)
	protected String tmpPassword;

	/**
	 * Gets the value of the response property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResponse() {
		return response;
	}

	/**
	 * Sets the value of the response property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResponse(String value) {
		this.response = value;
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
	 * Gets the value of the tmpPassword property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTmpPassword() {
		return tmpPassword;
	}

	/**
	 * Sets the value of the tmpPassword property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTmpPassword(String value) {
		this.tmpPassword = value;
	}

}
