package com.gmg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for MedicalRecord complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="MedicalRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="document" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doc_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doc_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doc_date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doc_caption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicalRecord", namespace = "http://services.gmg.com/MedicalRecords/1.0", propOrder = {
		"document", "docId", "docName", "docDate", "docCaption" })
public class MedicalRecord {

	@XmlElement(required = true)
	protected String document;
	@XmlElement(name = "doc_id", required = true)
	protected String docId;
	@XmlElement(name = "doc_name", required = true)
	protected String docName;
	@XmlElement(name = "doc_date", required = true)
	protected String docDate;
	@XmlElement(name = "doc_caption", required = true)
	protected String docCaption;

	/**
	 * Gets the value of the document property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDocument() {
		return document;
	}

	/**
	 * Sets the value of the document property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDocument(String value) {
		this.document = value;
	}

	/**
	 * Gets the value of the docId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDocId() {
		return docId;
	}

	/**
	 * Sets the value of the docId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDocId(String value) {
		this.docId = value;
	}

	/**
	 * Gets the value of the docName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDocName() {
		return docName;
	}

	/**
	 * Sets the value of the docName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDocName(String value) {
		this.docName = value;
	}

	/**
	 * Gets the value of the docDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDocDate() {
		return docDate;
	}

	/**
	 * Sets the value of the docDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDocDate(String value) {
		this.docDate = value;
	}

	/**
	 * Gets the value of the docCaption property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDocCaption() {
		return docCaption;
	}

	/**
	 * Sets the value of the docCaption property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDocCaption(String value) {
		this.docCaption = value;
	}

}
