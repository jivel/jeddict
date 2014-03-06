//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.01.21 at 01:52:19 PM IST
//
package org.netbeans.jpa.modeler.spec;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.netbeans.jpa.modeler.spec.extend.CompositionAttribute;

/**
 *
 *
 * @Target({METHOD, FIELD}) @Retention(RUNTIME) public @interface Embedded {}
 *
 *
 *
 * <p>
 * Java class for embedded complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="embedded">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attribute-override" type="{http://java.sun.com/xml/ns/persistence/orm}attribute-override" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="association-override" type="{http://java.sun.com/xml/ns/persistence/orm}association-override" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="access" type="{http://java.sun.com/xml/ns/persistence/orm}access-type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "embedded", propOrder = {
    "attributeOverride",
    "associationOverride"
})
public class Embedded extends CompositionAttribute {

    @XmlElement(name = "attribute-override")
    protected List<AttributeOverride> attributeOverride;
    @XmlElement(name = "association-override")
    protected List<AssociationOverride> associationOverride;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute
    protected AccessType access;

    /**
     * Gets the value of the attributeOverride property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the attributeOverride property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeOverride().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeOverride }
     *
     *
     */
    public List<AttributeOverride> getAttributeOverride() {
        if (attributeOverride == null) {
            attributeOverride = new ArrayList<AttributeOverride>();
        }
        return this.attributeOverride;
    }

    /**
     * Gets the value of the associationOverride property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the associationOverride property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociationOverride().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationOverride }
     *
     *
     */
    public List<AssociationOverride> getAssociationOverride() {
        if (associationOverride == null) {
            associationOverride = new ArrayList<AssociationOverride>();
        }
        return this.associationOverride;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the access property.
     *
     * @return possible object is {@link AccessType }
     *
     */
    public AccessType getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     *
     * @param value allowed object is {@link AccessType }
     *
     */
    public void setAccess(AccessType value) {
        this.access = value;
    }

}
