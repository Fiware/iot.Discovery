//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.25 at 06:50:50 PM BST 
//


package uk.ac.surrey.ee.iot.fiware.ngsi9.pojo;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscoveryContextAvailabilityRequest")
@XmlRootElement(name = "discoverContextAvailabilityRequest")
public class DiscoveryContextAvailabilityRequest{

    @XmlElement(required = true)
    @XmlElementWrapper(name="entityIdList")
    @SerializedName("entities")
//    protected EntityIdList entityIdList;
    protected List<EntityId> entityId;
    @XmlElementWrapper(name="attributeList")
    @SerializedName("attributes")
    protected List<String> attribute;
//    protected AttributeList attributeList;
    protected Restriction restriction;

    /**
     * Gets the value of the entityIdList property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdList }
     *     
     */
     public List<EntityId> getEntityId() {
        if (entityId == null) {
            entityId = new ArrayList<EntityId>();
        }
        return this.entityId;
    }

    /**
     * Sets the value of the entityIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdList }
     *     
     */


    /**
     * Gets the value of the attributeList property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeList }
     *     
     */
    public List<String> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<String>();
        }
        return this.attribute;
    }

    /**
     * Sets the value of the attributeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeList }
     *     
     */
    

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link Restriction }
     *     
     */
    public Restriction getRestriction() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Restriction }
     *     
     */
    public void setRestriction(Restriction value) {
        this.restriction = value;
    }

}
