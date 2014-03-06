//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.01.21 at 01:52:19 PM IST
//
package org.netbeans.jpa.modeler.spec;

import java.util.ArrayList;
import java.util.List;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.VariableElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.netbeans.jpa.modeler.spec.extend.JoinColumnHandler;
import org.netbeans.jpa.modeler.spec.extend.RelationAttribute;
import org.netbeans.jpa.source.JavaSourceParserUtil;

/**
 *
 *
 * @Target({METHOD, FIELD}) @Retention(RUNTIME) public @interface ManyToOne {
 * Class targetEntity() default void.class; CascadeType[] cascade() default {};
 * FetchType fetch() default EAGER; boolean optional() default true; }
 *
 *
 *
 * <p>
 * Java class for many-to-one complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="many-to-one">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="join-column" type="{http://java.sun.com/xml/ns/persistence/orm}join-column" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="join-table" type="{http://java.sun.com/xml/ns/persistence/orm}join-table" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="cascade" type="{http://java.sun.com/xml/ns/persistence/orm}cascade-type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="target-entity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fetch" type="{http://java.sun.com/xml/ns/persistence/orm}fetch-type" />
 *       &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="access" type="{http://java.sun.com/xml/ns/persistence/orm}access-type" />
 *       &lt;attribute name="maps-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "many-to-one", propOrder = {
    "joinColumn",
    "joinTable",
    "cascade"
})
public class ManyToOne extends RelationAttribute implements JoinColumnHandler {

    @XmlElement(name = "join-column")
    protected List<JoinColumn> joinColumn;
    @XmlElement(name = "join-table")
    protected JoinTable joinTable;
    protected CascadeType cascade;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute(name = "target-entity")
    protected String targetEntity;
    @XmlAttribute
    protected FetchType fetch;
    @XmlAttribute
    protected Boolean optional;
    @XmlAttribute
    protected AccessType access;
    @XmlAttribute(name = "maps-id")
    protected String mapsId;
    @XmlAttribute
    protected Boolean id;

    public static ManyToOne load(Element element, VariableElement variableElement) {
        AnnotationMirror annotationMirror = JavaSourceParserUtil.findAnnotation(element, "javax.persistence.ManyToOne");
        ManyToOne manyToOne = new ManyToOne();
        manyToOne.joinTable = JoinTable.load(element, variableElement);

        AnnotationMirror joinColumnsAnnotationMirror = JavaSourceParserUtil.findAnnotation(element, "javax.persistence.JoinColumns");
        if (joinColumnsAnnotationMirror != null) {
            List joinColumnsAnnot = (List) JavaSourceParserUtil.findAnnotationValue(joinColumnsAnnotationMirror, "value");
            if (joinColumnsAnnot != null) {
                for (Object joinColumnObj : joinColumnsAnnot) {
                    manyToOne.getJoinColumn().add(JoinColumn.load(element, variableElement, (AnnotationMirror) joinColumnObj));
                }
            }
        }

        List cascadeList = (List) JavaSourceParserUtil.findAnnotationValue(annotationMirror, "cascade");
        if (cascadeList != null) {
            CascadeType cascadeType = new CascadeType();
            manyToOne.cascade = cascadeType;
            for (Object cascadeObj : cascadeList) {
                if (cascadeObj.equals("ALL")) {
                    cascadeType.setCascadeAll(new EmptyType());
                } else if (cascadeObj.equals("PERSIST")) {
                    cascadeType.setCascadePersist(new EmptyType());
                } else if (cascadeObj.equals("MERGE")) {
                    cascadeType.setCascadeMerge(new EmptyType());
                } else if (cascadeObj.equals("REMOVE")) {
                    cascadeType.setCascadeMerge(new EmptyType());
                } else if (cascadeObj.equals("REFRESH")) {
                    cascadeType.setCascadeRefresh(new EmptyType());
                } else if (cascadeObj.equals("DETACH")) {
                    cascadeType.setCascadeDetach(new EmptyType());
                } else {
                    throw new IllegalStateException("Unknown Cascade Type : " + cascadeObj.toString());
                }
            }
        }

        manyToOne.name = variableElement.getSimpleName().toString();
        manyToOne.targetEntity = (String) JavaSourceParserUtil.findAnnotationValue(annotationMirror, "targetEntity");
        Object fetchObj = JavaSourceParserUtil.findAnnotationValue(annotationMirror, "fetch");
        if (fetchObj != null) {
            manyToOne.fetch = FetchType.valueOf(fetchObj.toString());
        }
        manyToOne.optional = (Boolean) JavaSourceParserUtil.findAnnotationValue(annotationMirror, "optional");
        manyToOne.access = AccessType.load(element, variableElement);

        return manyToOne;
    }

    /**
     * Gets the value of the joinColumn property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the joinColumn property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJoinColumn().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JoinColumn }
     *
     *
     */
    public List<JoinColumn> getJoinColumn() {
        if (joinColumn == null) {
            joinColumn = new ArrayList<JoinColumn>();
        }
        return this.joinColumn;
    }

    @Override
    public void addJoinColumn(JoinColumn joinColumn_In) {
        if (joinColumn == null) {
            joinColumn = new ArrayList<JoinColumn>();
        }
        joinColumn.add(joinColumn_In);
    }

    @Override
    public void removeJoinColumn(JoinColumn joinColumn_In) {
        if (joinColumn == null) {
            joinColumn = new ArrayList<JoinColumn>();
        }
        joinColumn.remove(joinColumn_In);
    }

    /**
     * Gets the value of the joinTable property.
     *
     * @return possible object is {@link JoinTable }
     *
     */
    @Override
    public JoinTable getJoinTable() {
        if (joinTable == null) {
            joinTable = new JoinTable();
        }
        return joinTable;
    }

    /**
     * Sets the value of the joinTable property.
     *
     * @param value allowed object is {@link JoinTable }
     *
     */
    public void setJoinTable(JoinTable value) {
        this.joinTable = value;
    }

    /**
     * Gets the value of the cascade property.
     *
     * @return possible object is {@link CascadeType }
     *
     */
    public CascadeType getCascade() {
        return cascade;
    }

    /**
     * Sets the value of the cascade property.
     *
     * @param value allowed object is {@link CascadeType }
     *
     */
    public void setCascade(CascadeType value) {
        this.cascade = value;
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
     * Gets the value of the targetEntity property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTargetEntity() {
        return targetEntity;
    }

    /**
     * Sets the value of the targetEntity property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTargetEntity(String value) {
        this.targetEntity = value;
    }

    /**
     * Gets the value of the fetch property.
     *
     * @return possible object is {@link FetchType }
     *
     */
    public FetchType getFetch() {
        return fetch;
    }

    /**
     * Sets the value of the fetch property.
     *
     * @param value allowed object is {@link FetchType }
     *
     */
    public void setFetch(FetchType value) {
        this.fetch = value;
    }

    /**
     * Gets the value of the optional property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean getOptional() {//isOptional() {
        return optional;
    }

    /**
     * Sets the value of the optional property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setOptional(Boolean value) {
        this.optional = value;
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

    /**
     * Gets the value of the mapsId property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMapsId() {
        return mapsId;
    }

    /**
     * Sets the value of the mapsId property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMapsId(String value) {
        this.mapsId = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setId(Boolean value) {
        this.id = value;
    }

}
