
package br.udesc.servicos.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPedido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codPedido" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPedido", propOrder = {
    "codPedido"
})
public class GetPedido {

    protected int codPedido;

    /**
     * Gets the value of the codPedido property.
     * 
     */
    public int getCodPedido() {
        return codPedido;
    }

    /**
     * Sets the value of the codPedido property.
     * 
     */
    public void setCodPedido(int value) {
        this.codPedido = value;
    }

}
