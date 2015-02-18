//package br.com.fastline.ws_fastline.model_web;
//
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
//import br.com.fastline.ws_fastline.model.Produto;
//
//@XmlRootElement
//@Entity
//@Table(name = "TB_ITENS_DOC_ENTRADA")
//@IdClass(value=ItensDocEntradaPK.class)
//public class ItensDocEntrada implements Serializable{
//	
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 6575582291809822030L;
//
//	/**
//	 * 
//	 */
//	@Id
//	@ManyToOne
//	@JoinColumn(name="id_doc_entrada", nullable=false)
//	private DocEntrada doc_entrada;
//	
//	@Id
//	@ManyToOne
//	@JoinColumn(name="id_produto", nullable=false)
//	private Produto produto;
//	
//	@Column(name = "ITEM", nullable = false)
//	private int item;
//	
//	@Column(name = "QTD_ENTRADA", nullable = false)
//	private int qtd_entrada;
//	
//	@NumberFormat(style = Style.CURRENCY)
//	@Column(name = "PRECO_ENTRADA", nullable = false, precision = 9, scale = 2)
//	private BigDecimal preco_entrada;
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
//	
//	public int getItem() {
//		return item;
//	}
//
//	public void setItem(int item) {
//		this.item = item;
//	}
//
//	public int getQtd_entrada() {
//		return qtd_entrada;
//	}
//
//	public void setQtd_entrada(int qtd_entrada) {
//		this.qtd_entrada = qtd_entrada;
//	}
//
//	public BigDecimal getPreco_entrada() {
//		return preco_entrada;
//	}
//
//	public void setPreco_entrada(BigDecimal preco_entrada) {
//		this.preco_entrada = preco_entrada;
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
//	public DocEntrada getDoc_entrada() {
//		return doc_entrada;
//	}
//
//	public void setDoc_entrada(DocEntrada doc_entrada) {
//		this.doc_entrada = doc_entrada;
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
//
//	
//	
//}
