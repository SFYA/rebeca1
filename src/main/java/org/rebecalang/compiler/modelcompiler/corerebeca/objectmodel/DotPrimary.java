//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.17 at 11:29:01 AM IRDT 
//


package org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DotPrimary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DotPrimary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}PrimaryExpression">
 *       &lt;sequence>
 *         &lt;element name="left" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Expression"/>
 *         &lt;element name="right" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}PrimaryExpression"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DotPrimary", namespace = "http://rebecalang.org/compiler/modelcompiler/corerebecaexpression", propOrder = {
    "left",
    "right"
})
public class DotPrimary
    extends PrimaryExpression
{

    @XmlElement(required = true)
    protected Expression left;
    @XmlElement(required = true)
    protected PrimaryExpression right;

    /**
     * Gets the value of the left property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getLeft() {
        return left;
    }

    /**
     * Sets the value of the left property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setLeft(Expression value) {
        this.left = value;
    }

    /**
     * Gets the value of the right property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryExpression }
     *     
     */
    public PrimaryExpression getRight() {
        return right;
    }

    /**
     * Sets the value of the right property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryExpression }
     *     
     */
    public void setRight(PrimaryExpression value) {
        this.right = value;
    }

}
