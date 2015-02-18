package br.com.fastline.ws_fastline.model;


import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

@XmlRootElement
@Entity
@Table(name = "TB_ITENS_PEDIDO")
@IdClass(value=ItensPedidoPK.class)
public class ItensPedido implements Serializable{
	private static final long serialVersionUID = 6575582291809822030L;

	@Id
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(referencedColumnName="id_pedido", name="id_pedido")
	private Pedido pedido;

	@Id
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(referencedColumnName="id_produto", name="id_produto")
	private Produto produto;

	@Column(name = "ITEM", nullable = false)
	private int item;

	@Column(name = "QTD_VENDA", nullable = false)
	private int qtd_venda;

	@NumberFormat(style = Style.CURRENCY)
	@Column(name = "PRECO_VENDA", nullable = false, precision = 9, scale = 2)
	private BigDecimal preco_venda;

	@NumberFormat(style = Style.CURRENCY)
	@Column(name = "DESCONTO", nullable = false, precision = 9, scale = 2)
	private BigDecimal desconto;

	@NumberFormat(style = Style.CURRENCY)
	@Column(name = "VLR_TOTAL_ITEM", nullable = false, precision = 9, scale = 2)
	private BigDecimal vlr_total_item;


	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public int getQtd_venda() {
		return qtd_venda;
	}

	public void setQtd_venda(int qtd_venda) {
		this.qtd_venda = qtd_venda;
	}

	public BigDecimal getPreco_venda() {
		return preco_venda;
	}

	public void setPreco_venda(BigDecimal preco_venda) {
		this.preco_venda = preco_venda;
	}

	public BigDecimal getDesconto() {
		return desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	public BigDecimal getVlr_total_item() {
		return vlr_total_item;
	}

	public void setVlr_total_item(BigDecimal vlr_total_item) {
		this.vlr_total_item = vlr_total_item;
	}

//	public Pedido getPedido() {
//		return pedido;
//	}
//
//	public void setPedido(Pedido pedido) {
//		this.pedido = pedido;
//	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}




}
