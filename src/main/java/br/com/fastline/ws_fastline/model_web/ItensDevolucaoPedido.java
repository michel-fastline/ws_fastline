//package br.com.fastline.ws_fastline.model_web;
//
//import java.io.Serializable;
//import java.math.BigDecimal;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.IdClass;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//import javax.xml.bind.annotation.XmlRootElement;
//
//import org.springframework.format.annotation.NumberFormat;
//import org.springframework.format.annotation.NumberFormat.Style;
//
//import br.com.fastline.ws_fastline.model.Pedido;
//import br.com.fastline.ws_fastline.model.Produto;
//
//
//
//@XmlRootElement
//@Entity
//@Table(name = "TB_ITENS_DEVOLUCAO_PEDIDO")
//@IdClass(value=ItensDevolucaoPedidoPK.class)
//public class ItensDevolucaoPedido implements Serializable{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -5956996739303238643L;
//	
//	@Id
//	@ManyToOne
//	@JoinColumn(name="id_devolucao_pedido", nullable=false)
//	private Pedido devolucao_pedido;
//	
//	@Id
//	@ManyToOne
//	@JoinColumn(name="id_produto", nullable=false)
//	private Produto produto;
//	
//	@Column(name = "ITEM", nullable = false)
//	private int item;
//	
//	@Column(name = "QTD_DEVOLUCAO", nullable = false)
//	private int qtd_devolucao;
//	
//	@NumberFormat(style = Style.CURRENCY)
//	@Column(name = "PRECO_DEVOLUCAO", nullable = false, precision = 9, scale = 2)
//	private BigDecimal preco_devolucao;
//	
//	@NumberFormat(style = Style.CURRENCY)
//	@Column(name = "DESCONTO", nullable = false, precision = 9, scale = 2)
//	private BigDecimal desconto;
//	
//	@NumberFormat(style = Style.CURRENCY)
//	@Column(name = "VLR_TOTAL_ITEM", nullable = false, precision = 9, scale = 2)
//	private BigDecimal vlr_total_item;
//
//	
//
//	public Pedido getDevolucao_pedido() {
//		return devolucao_pedido;
//	}
//
//	public void setDevolucao_pedido(Pedido devolucao_pedido) {
//		this.devolucao_pedido = devolucao_pedido;
//	}
//
//	public Produto getProduto() {
//		return produto;
//	}
//
//	public void setProduto(Produto produto) {
//		this.produto = produto;
//	}
//
//	public int getItem() {
//		return item;
//	}
//
//	public void setItem(int item) {
//		this.item = item;
//	}
//
//	public int getQtd_devolucao() {
//		return qtd_devolucao;
//	}
//
//	public void setQtd_devolucao(int qtd_devolucao) {
//		this.qtd_devolucao = qtd_devolucao;
//	}
//
//	public BigDecimal getPreco_devolucao() {
//		return preco_devolucao;
//	}
//
//	public void setPreco_devolucao(BigDecimal preco_devolucao) {
//		this.preco_devolucao = preco_devolucao;
//	}
//
//	public BigDecimal getDesconto() {
//		return desconto;
//	}
//
//	public void setDesconto(BigDecimal desconto) {
//		this.desconto = desconto;
//	}
//
//	public BigDecimal getVlr_total_item() {
//		return vlr_total_item;
//	}
//
//	public void setVlr_total_item(BigDecimal vlr_total_item) {
//		this.vlr_total_item = vlr_total_item;
//	}
//	
//	
//}
