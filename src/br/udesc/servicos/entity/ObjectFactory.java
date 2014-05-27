
package br.udesc.servicos.entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.udesc.servicos.entity package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetPedidosPorStatus_QNAME = new QName("http://entity.servicos.udesc.br/", "getPedidosPorStatus");
    private final static QName _CreatePedido_QNAME = new QName("http://entity.servicos.udesc.br/", "createPedido");
    private final static QName _Produto_QNAME = new QName("http://entity.servicos.udesc.br/", "produto");
    private final static QName _AlterarStatusPedido_QNAME = new QName("http://entity.servicos.udesc.br/", "alterarStatusPedido");
    private final static QName _GetPedido_QNAME = new QName("http://entity.servicos.udesc.br/", "getPedido");
    private final static QName _GetPedidoResponse_QNAME = new QName("http://entity.servicos.udesc.br/", "getPedidoResponse");
    private final static QName _GetPedidosPorStatusResponse_QNAME = new QName("http://entity.servicos.udesc.br/", "getPedidosPorStatusResponse");
    private final static QName _CreatePedidoResponse_QNAME = new QName("http://entity.servicos.udesc.br/", "createPedidoResponse");
    private final static QName _Pedido_QNAME = new QName("http://entity.servicos.udesc.br/", "pedido");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.udesc.servicos.entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AlterarStatusPedido }
     * 
     */
    public AlterarStatusPedido createAlterarStatusPedido() {
        return new AlterarStatusPedido();
    }

    /**
     * Create an instance of {@link GetPedidosPorStatus }
     * 
     */
    public GetPedidosPorStatus createGetPedidosPorStatus() {
        return new GetPedidosPorStatus();
    }

    /**
     * Create an instance of {@link Produto }
     * 
     */
    public Produto createProduto() {
        return new Produto();
    }

    /**
     * Create an instance of {@link CreatePedido }
     * 
     */
    public CreatePedido createCreatePedido() {
        return new CreatePedido();
    }

    /**
     * Create an instance of {@link GetPedidoResponse }
     * 
     */
    public GetPedidoResponse createGetPedidoResponse() {
        return new GetPedidoResponse();
    }

    /**
     * Create an instance of {@link GetPedido }
     * 
     */
    public GetPedido createGetPedido() {
        return new GetPedido();
    }

    /**
     * Create an instance of {@link Pedido }
     * 
     */
    public Pedido createPedido() {
        return new Pedido();
    }

    /**
     * Create an instance of {@link GetPedidosPorStatusResponse }
     * 
     */
    public GetPedidosPorStatusResponse createGetPedidosPorStatusResponse() {
        return new GetPedidosPorStatusResponse();
    }

    /**
     * Create an instance of {@link CreatePedidoResponse }
     * 
     */
    public CreatePedidoResponse createCreatePedidoResponse() {
        return new CreatePedidoResponse();
    }

    /**
     * Create an instance of {@link ItemPedido }
     * 
     */
    public ItemPedido createItemPedido() {
        return new ItemPedido();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPedidosPorStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.servicos.udesc.br/", name = "getPedidosPorStatus")
    public JAXBElement<GetPedidosPorStatus> createGetPedidosPorStatus(GetPedidosPorStatus value) {
        return new JAXBElement<GetPedidosPorStatus>(_GetPedidosPorStatus_QNAME, GetPedidosPorStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.servicos.udesc.br/", name = "createPedido")
    public JAXBElement<CreatePedido> createCreatePedido(CreatePedido value) {
        return new JAXBElement<CreatePedido>(_CreatePedido_QNAME, CreatePedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Produto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.servicos.udesc.br/", name = "produto")
    public JAXBElement<Produto> createProduto(Produto value) {
        return new JAXBElement<Produto>(_Produto_QNAME, Produto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.servicos.udesc.br/", name = "alterarStatusPedido")
    public JAXBElement<AlterarStatusPedido> createAlterarStatusPedido(AlterarStatusPedido value) {
        return new JAXBElement<AlterarStatusPedido>(_AlterarStatusPedido_QNAME, AlterarStatusPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.servicos.udesc.br/", name = "getPedido")
    public JAXBElement<GetPedido> createGetPedido(GetPedido value) {
        return new JAXBElement<GetPedido>(_GetPedido_QNAME, GetPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.servicos.udesc.br/", name = "getPedidoResponse")
    public JAXBElement<GetPedidoResponse> createGetPedidoResponse(GetPedidoResponse value) {
        return new JAXBElement<GetPedidoResponse>(_GetPedidoResponse_QNAME, GetPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPedidosPorStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.servicos.udesc.br/", name = "getPedidosPorStatusResponse")
    public JAXBElement<GetPedidosPorStatusResponse> createGetPedidosPorStatusResponse(GetPedidosPorStatusResponse value) {
        return new JAXBElement<GetPedidosPorStatusResponse>(_GetPedidosPorStatusResponse_QNAME, GetPedidosPorStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.servicos.udesc.br/", name = "createPedidoResponse")
    public JAXBElement<CreatePedidoResponse> createCreatePedidoResponse(CreatePedidoResponse value) {
        return new JAXBElement<CreatePedidoResponse>(_CreatePedidoResponse_QNAME, CreatePedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entity.servicos.udesc.br/", name = "pedido")
    public JAXBElement<Pedido> createPedido(Pedido value) {
        return new JAXBElement<Pedido>(_Pedido_QNAME, Pedido.class, null, value);
    }

}
