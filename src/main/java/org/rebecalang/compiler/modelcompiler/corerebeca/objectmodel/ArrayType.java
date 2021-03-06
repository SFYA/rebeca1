//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.17 at 11:29:01 AM IRDT 
//


package org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Type">
 *       &lt;sequence>
 *         &lt;element name="dimensions" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *         &lt;element name="primitiveType" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}PrimitiveType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayType", namespace = "http://rebecalang.org/compiler/modelcompiler/corerebecaexpression", propOrder = {
    "dimensions",
    "primitiveType"
})
public class ArrayType
    extends Type
{

    @XmlElement(type = Integer.class)
    protected List<Integer> dimensions;
    @XmlElement(required = true)
    protected PrimitiveType primitiveType;

    /**
     * Gets the value of the dimensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getDimensions() {
        if (dimensions == null) {
            dimensions = new ArrayList<Integer>();
        }
        return this.dimensions;
    }

    /**
     * Gets the value of the primitiveType property.
     * 
     * @return
     *     possible object is
     *     {@link PrimitiveType }
     *     
     */
    public PrimitiveType getPrimitiveType() {
        return primitiveType;
    }

    /**
     * Sets the value of the primitiveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimitiveType }
     *     
     */
    public void setPrimitiveType(PrimitiveType value) {
        this.primitiveType = value;
    }

}
