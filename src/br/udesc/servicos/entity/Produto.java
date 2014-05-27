
package br.udesc.servicos.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for produto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="produto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantidadeEstoque" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="valorUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "produto", propOrder = {
    "codigo",
    "descricao",
    "quantidadeEstoque",
    "valorUnitario"
})
public class Produto {

    protected int codigo;
    protected String descricao;
    protected int quantidadeEstoque;
    protected double valorUnitario;

    /**
     * Gets the value of the codigo property.
     * 
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     */
    public void setCodigo(int value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the descricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Gets the value of the quantidadeEstoque property.
     * 
     */
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    /**
     * Sets the value of the quantidadeEstoque property.
     * 
     */
    public void setQuantidadeEstoque(int value) {
        this.quantidadeEstoque = value;
    }

    /**
     * Gets the value of the valorUnitario property.
     * 
     */
    public double getValorUnitario() {
        return valorUnitario;
    }

    /**
     * Sets the value of the valorUnitario property.
     * 
     */
    public void setValorUnitario(double value) {
        this.valorUnitario = value;
    }

}
