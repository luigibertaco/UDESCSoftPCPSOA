
package br.udesc.servicos.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPedidosPorStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPedidosPorStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPedidosPorStatus", propOrder = {
    "codStatus"
})
public class GetPedidosPorStatus {

    protected int codStatus;

    /**
     * Gets the value of the codStatus property.
     * 
     */
    public int getCodStatus() {
        return codStatus;
    }

    /**
     * Sets the value of the codStatus property.
     * 
     */
    public void setCodStatus(int value) {
        this.codStatus = value;
    }

}
