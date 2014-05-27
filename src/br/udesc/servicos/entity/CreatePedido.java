
package br.udesc.servicos.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createPedido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pedido" type="{http://entity.servicos.udesc.br/}pedido" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPedido", propOrder = {
    "pedido"
})
public class CreatePedido {

    protected Pedido pedido;

    /**
     * Gets the value of the pedido property.
     * 
     * @return
     *     possible object is
     *     {@link Pedido }
     *     
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * Sets the value of the pedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pedido }
     *     
     */
    public void setPedido(Pedido value) {
        this.pedido = value;
    }

}
