//package br.com.fastline.ws_fastline.model_web;
//
//import java.io.Serializable;
//import java.math.BigDecimal;
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.IdClass;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.xml.bind.annotation.XmlRootElement;
//
//import org.springframework.format.annotation.NumberFormat;
//import org.springframework.format.annotation.NumberFormat.Style;
//
//@XmlRootElement
//@Entity
//@Table(name = "TB_MOVIMENTO_CAIXA")
//@IdClass(value=MovimentoCaixaPK.class)
//public class MovimentoCaixa implements Serializable {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -506715796949598421L;
//	
//	@Id
//	@Temporal(TemporalType.DATE)
//	@Column(name = "DT_MOVIMENTO", nullable = false)
//	private Date dt_movimento;
//	
//	@Id
//	@ManyToOne
//	@JoinColumn(name="id_caixa", nullable=false)
//	private Caixa caixa;
//	
//	@NumberFormat(style = Style.CURRENCY)
//	@Column(name = "VLR_PAG_DESPESAS", nullable = true, precision = 9, scale = 2)
//	private BigDecimal vlr_pag_despesas;
//	
//	@NumberFormat(style = Style.CURRENCY)
//	@Column(name = "VLR_PAG_FORNECEDORES", nullable = true, precision = 9, scale = 2)
//	private BigDecimal vlr_pag_fornecedores;
//	
//	@NumberFormat(style = Style.CURRENCY)
//	@Column(name = "VLR_VENDA_CARTAO", nullable = true, precision = 9, scale = 2)
//	private BigDecimal vlr_venda_cartao;
//	
//	@NumberFormat(style = Style.CURRENCY)
//	@Column(name = "VLR_INICIO", nullable = false, precision = 9, scale = 2)
//	private BigDecimal vlr_inicio;
//	
//	@NumberFormat(style = Style.CURRENCY)
//	@Column(name = "VLR_FINAL", nullable = false, precision = 9, scale = 2)
//	private BigDecimal vlr_final;
//	
//	@NumberFormat(style = Style.CURRENCY)
//	@Column(name = "VLR_VENDA_DINHEIRO", nullable = true, precision = 9, scale = 2)
//	private BigDecimal vlr_venda_dinheiro;
//	
//	@NumberFormat(style = Style.CURRENCY)
//	@Column(name = "VLR_SANGRIA", nullable = true, precision = 9, scale = 2)
//	private BigDecimal vlr_sangria;
//	
//	@NumberFormat(style = Style.CURRENCY)
//	@Column(name = "VLR_DEVOLUCOES", nullable = true, precision = 9, scale = 2)
//	private BigDecimal vlr_devolucoes;
//
//	public Caixa getCaixa() {
//		return caixa;
//	}
//
//	public void setCaixa(Caixa caixa) {
//		this.caixa = caixa;
//	}
//
//	public Date getDt_movimento() {
//		return dt_movimento;
//	}
//
//	public void setDt_movimento(Date dt_movimento) {
//		this.dt_movimento = dt_movimento;
//	}
//
//	public BigDecimal getVlr_pag_despesas() {
//		return vlr_pag_despesas;
//	}
//
//	public void setVlr_pag_despesas(BigDecimal vlr_pag_despesas) {
//		this.vlr_pag_despesas = vlr_pag_despesas;
//	}
//
//	public BigDecimal getVlr_pag_fornecedores() {
//		return vlr_pag_fornecedores;
//	}
//
//	public void setVlr_pag_fornecedores(BigDecimal vlr_pag_fornecedores) {
//		this.vlr_pag_fornecedores = vlr_pag_fornecedores;
//	}
//
//	public BigDecimal getVlr_venda_cartao() {
//		return vlr_venda_cartao;
//	}
//
//	public void setVlr_venda_cartao(BigDecimal vlr_venda_cartao) {
//		this.vlr_venda_cartao = vlr_venda_cartao;
//	}
//
//	public BigDecimal getVlr_inicio() {
//		return vlr_inicio;
//	}
//
//	public void setVlr_inicio(BigDecimal vlr_inicio) {
//		this.vlr_inicio = vlr_inicio;
//	}
//
//	public BigDecimal getVlr_final() {
//		return vlr_final;
//	}
//
//	public void setVlr_final(BigDecimal vlr_final) {
//		this.vlr_final = vlr_final;
//	}
//
//	public BigDecimal getVlr_venda_dinheiro() {
//		return vlr_venda_dinheiro;
//	}
//
//	public void setVlr_venda_dinheiro(BigDecimal vlr_venda_dinheiro) {
//		this.vlr_venda_dinheiro = vlr_venda_dinheiro;
//	}
//
//	public BigDecimal getVlr_sangria() {
//		return vlr_sangria;
//	}
//
//	public void setVlr_sangria(BigDecimal vlr_sangria) {
//		this.vlr_sangria = vlr_sangria;
//	}
//
//	public BigDecimal getVlr_devolucoes() {
//		return vlr_devolucoes;
//	}
//
//	public void setVlr_devolucoes(BigDecimal vlr_devolucoes) {
//		this.vlr_devolucoes = vlr_devolucoes;
//	}
//	
//	
//}
