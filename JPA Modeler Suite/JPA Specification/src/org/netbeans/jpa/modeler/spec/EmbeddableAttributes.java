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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.netbeans.jpa.modeler.spec.extend.IAttributes;

/**
 * <p>
 * Java class for embeddable-attributes complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="embeddable-attributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{http://java.sun.com/xml/ns/persistence/orm}basic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="many-to-one" type="{http://java.sun.com/xml/ns/persistence/orm}many-to-one" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="one-to-many" type="{http://java.sun.com/xml/ns/persistence/orm}one-to-many" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="one-to-one" type="{http://java.sun.com/xml/ns/persistence/orm}one-to-one" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="many-to-many" type="{http://java.sun.com/xml/ns/persistence/orm}many-to-many" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="element-collection" type="{http://java.sun.com/xml/ns/persistence/orm}element-collection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="embedded" type="{http://java.sun.com/xml/ns/persistence/orm}embedded" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transient" type="{http://java.sun.com/xml/ns/persistence/orm}transient" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "embeddable-attributes", propOrder = {
    "basic",
    "manyToOne",
    "oneToMany",
    "oneToOne",
    "manyToMany",
    "elementCollection",
    "embedded",
    "_transient"
})
public class EmbeddableAttributes implements IAttributes {

    protected List<Basic> basic;
    @XmlElement(name = "many-to-one")
    protected List<ManyToOne> manyToOne;
    @XmlElement(name = "one-to-many")
    protected List<OneToMany> oneToMany;
    @XmlElement(name = "one-to-one")
    protected List<OneToOne> oneToOne;
    @XmlElement(name = "many-to-many")
    protected List<ManyToMany> manyToMany;
    @XmlElement(name = "element-collection")
    protected List<ElementCollection> elementCollection;
    protected List<Embedded> embedded;
    @XmlElement(name = "transient")
    protected List<Transient> _transient;

    /**
     * Gets the value of the basic property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the basic property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasic().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Basic }
     *
     *
     */
    @Override
    public List<Basic> getBasic() {
        if (basic == null) {
            basic = new ArrayList<Basic>();
        }
        return this.basic;
    }

    /**
     * Gets the value of the manyToOne property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the manyToOne property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManyToOne().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManyToOne }
     *
     *
     */
    @Override
    public List<ManyToOne> getManyToOne() {
        if (manyToOne == null) {
            manyToOne = new ArrayList<ManyToOne>();
        }
        return this.manyToOne;
    }

    /**
     * Gets the value of the oneToMany property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the oneToMany property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOneToMany().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OneToMany }
     *
     *
     */
    @Override
    public List<OneToMany> getOneToMany() {
        if (oneToMany == null) {
            oneToMany = new ArrayList<OneToMany>();
        }
        return this.oneToMany;
    }

    /**
     * Gets the value of the oneToOne property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the oneToOne property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOneToOne().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OneToOne }
     *
     *
     */
    @Override
    public List<OneToOne> getOneToOne() {
        if (oneToOne == null) {
            oneToOne = new ArrayList<OneToOne>();
        }
        return this.oneToOne;
    }

    /**
     * Gets the value of the manyToMany property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the manyToMany property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManyToMany().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManyToMany }
     *
     *
     */
    @Override
    public List<ManyToMany> getManyToMany() {
        if (manyToMany == null) {
            manyToMany = new ArrayList<ManyToMany>();
        }
        return this.manyToMany;
    }

    /**
     * Gets the value of the elementCollection property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the elementCollection property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementCollection().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementCollection }
     *
     *
     */
    @Override
    public List<ElementCollection> getElementCollection() {
        if (elementCollection == null) {
            elementCollection = new ArrayList<ElementCollection>();
        }
        return this.elementCollection;
    }

    /**
     * Gets the value of the embedded property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the embedded property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmbedded().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Embedded }
     *
     *
     */
    @Override
    public List<Embedded> getEmbedded() {
        if (embedded == null) {
            embedded = new ArrayList<Embedded>();
        }
        return this.embedded;
    }

    /**
     * Gets the value of the transient property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the transient property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransient().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transient }
     *
     *
     */
    @Override
    public List<Transient> getTransient() {
        if (_transient == null) {
            _transient = new ArrayList<Transient>();
        }
        return this._transient;
    }

    @Override
    public boolean isAttributeExist(String name) {

        if (basic != null) {
            for (Basic basic_TMP : basic) {
                if (basic_TMP.getName() != null && basic_TMP.getName().equals(name)) {
                    return true;
                }
            }
        }
        if (_transient != null) {
            for (Transient transient_TMP : _transient) {
                if (transient_TMP.getName() != null && transient_TMP.getName().equals(name)) {
                    return true;
                }
            }
        }
        if (elementCollection != null) {
            for (ElementCollection elementCollection_TMP : elementCollection) {
                if (elementCollection_TMP.getName() != null && elementCollection_TMP.getName().equals(name)) {
                    return true;
                }
            }
        }
        if (embedded != null) {
            for (Embedded embedded_TMP : embedded) {
                if (embedded_TMP.getName() != null && embedded_TMP.getName().equals(name)) {
                    return true;
                }
            }
        }

        if (oneToOne != null) {
            for (OneToOne oneToOne_TMP : oneToOne) {
                if (oneToOne_TMP.getName() != null && oneToOne_TMP.getName().equals(name)) {
                    return true;
                }
            }
        }
        if (oneToMany != null) {
            for (OneToMany oneToMany_TMP : oneToMany) {
                if (oneToMany_TMP.getName() != null && oneToMany_TMP.getName().equals(name)) {
                    return true;
                }
            }
        }
        if (manyToOne != null) {
            for (ManyToOne manyToOne_TMP : manyToOne) {
                if (manyToOne_TMP.getName() != null && manyToOne_TMP.getName().equals(name)) {
                    return true;
                }
            }
        }
        if (manyToMany != null) {
            for (ManyToMany manyToMany_TMP : manyToMany) {
                if (manyToMany_TMP.getName() != null && manyToMany_TMP.getName().equals(name)) {
                    return true;
                }
            }
        }

        return false;
    }

}
