package com.gmg;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for UserResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="UserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountinfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="accountexpired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="accountlocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="credentialsexpired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="accountenabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="accountid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="addressinfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="province" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="personalinfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="firsName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="phonenumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "UserResponse", namespace = "http://services.gmg.com/UserResponse/1.0", propOrder = {
		"username", "type", "accountinfo", "addressinfo", "personalinfo",
		"userId" })
public class UserResponse {

	@XmlElement(required = true)
	protected String username;
	@XmlElement(required = true)
	protected String type;
	@XmlElement(required = true)
	protected UserResponse.Accountinfo accountinfo;
	protected UserResponse.Addressinfo addressinfo;
	@XmlElement(required = true)
	protected UserResponse.Personalinfo personalinfo;
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
	 * @return possible object is {@link UserResponse.Accountinfo }
	 * 
	 */
	public UserResponse.Accountinfo getAccountinfo() {
		return accountinfo;
	}

	/**
	 * Sets the value of the accountinfo property.
	 * 
	 * @param value
	 *            allowed object is {@link UserResponse.Accountinfo }
	 * 
	 */
	public void setAccountinfo(UserResponse.Accountinfo value) {
		this.accountinfo = value;
	}

	/**
	 * Gets the value of the addressinfo property.
	 * 
	 * @return possible object is {@link UserResponse.Addressinfo }
	 * 
	 */
	public UserResponse.Addressinfo getAddressinfo() {
		return addressinfo;
	}

	/**
	 * Sets the value of the addressinfo property.
	 * 
	 * @param value
	 *            allowed object is {@link UserResponse.Addressinfo }
	 * 
	 */
	public void setAddressinfo(UserResponse.Addressinfo value) {
		this.addressinfo = value;
	}

	/**
	 * Gets the value of the personalinfo property.
	 * 
	 * @return possible object is {@link UserResponse.Personalinfo }
	 * 
	 */
	public UserResponse.Personalinfo getPersonalinfo() {
		return personalinfo;
	}

	/**
	 * Sets the value of the personalinfo property.
	 * 
	 * @param value
	 *            allowed object is {@link UserResponse.Personalinfo }
	 * 
	 */
	public void setPersonalinfo(UserResponse.Personalinfo value) {
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

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
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
	@XmlType(name = "", propOrder = { "accountexpired", "accountlocked",
			"credentialsexpired", "accountenabled", "accountid" })
	public static class Accountinfo {

		@XmlElement(namespace = "http://services.gmg.com/UserResponse/1.0")
		protected boolean accountexpired;
		@XmlElement(namespace = "http://services.gmg.com/UserResponse/1.0")
		protected boolean accountlocked;
		@XmlElement(namespace = "http://services.gmg.com/UserResponse/1.0")
		protected Boolean credentialsexpired;
		@XmlElement(namespace = "http://services.gmg.com/UserResponse/1.0")
		protected boolean accountenabled;
		@XmlElement(namespace = "http://services.gmg.com/UserResponse/1.0", required = true)
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

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="province" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "address", "city", "country", "province" })
	public static class Addressinfo {

		@XmlElement(namespace = "http://services.gmg.com/UserResponse/1.0", required = true)
		protected String address;
		@XmlElement(namespace = "http://services.gmg.com/UserResponse/1.0", required = true)
		protected String city;
		@XmlElement(namespace = "http://services.gmg.com/UserResponse/1.0", required = true)
		protected String country;
		@XmlElement(namespace = "http://services.gmg.com/UserResponse/1.0", required = true)
		protected String province;

		/**
		 * Gets the value of the address property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAddress() {
			return address;
		}

		/**
		 * Sets the value of the address property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setAddress(String value) {
			this.address = value;
		}

		/**
		 * Gets the value of the city property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCity() {
			return city;
		}

		/**
		 * Sets the value of the city property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCity(String value) {
			this.city = value;
		}

		/**
		 * Gets the value of the country property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCountry() {
			return country;
		}

		/**
		 * Sets the value of the country property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCountry(String value) {
			this.country = value;
		}

		/**
		 * Gets the value of the province property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getProvince() {
			return province;
		}

		/**
		 * Sets the value of the province property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setProvince(String value) {
			this.province = value;
		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
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
	@XmlType(name = "", propOrder = { "firsName", "lastName", "height",
			"weight", "age", "phonenumber", "email", "website", "birthdate",
			"gender" })
	public static class Personalinfo {

		@XmlElement(namespace = "http://services.gmg.com/UserResponse/1.0", required = true)
		protected String firsName;
		@XmlElement(namespace = "http://services.gmg.com/UserResponse/1.0", required = true)
		protected String lastName;
		@XmlElement(namespace = "http://services.gmg.com/UserResponse/1.0")
		protected Double height;
		@XmlElement(namespace = "http://services.gmg.com/UserResponse/1.0")
		protected Double weight;
		@XmlElement(namespace = "http://services.gmg.com/UserResponse/1.0")
		protected BigInteger age;
		@XmlElement(namespace = "http://services.gmg.com/UserResponse/1.0")
		protected String phonenumber;
		@XmlElement(namespace = "http://services.gmg.com/UserResponse/1.0", required = true)
		protected String email;
		@XmlElement(namespace = "http://services.gmg.com/UserResponse/1.0")
		protected String website;
		@XmlElement(namespace = "http://services.gmg.com/UserResponse/1.0")
		protected String birthdate;
		@XmlElement(namespace = "http://services.gmg.com/UserResponse/1.0")
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

}
