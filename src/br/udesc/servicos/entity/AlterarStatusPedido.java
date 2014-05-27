
package br.udesc.servicos.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for alterarStatusPedido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alterarStatusPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codPedido" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="novoStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alterarStatusPedido", propOrder = {
    "codPedido",
    "novoStatus"
})
public class AlterarStatusPedido {

    protected int codPedido;
    protected int novoStatus;

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

    /**
     * Gets the value of the novoStatus property.
     * 
     */
    public int getNovoStatus() {
        return novoStatus;
    }

    /**
     * Sets the value of the novoStatus property.
     * 
     */
    public void setNovoStatus(int value) {
        this.novoStatus = value;
    }

}
