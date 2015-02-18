//package br.com.fastline.ws_fastline.model_web;
//
//import java.io.Serializable;
//import java.math.BigDecimal;
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
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
//import br.com.fastline.ws_fastline.constantes.TipoDevolucaoTitulo;
//
//@XmlRootElement
//@Entity
//@Table(name = "TB_TITULOS_PAGAR")
//@IdClass(value=TitulosPagarPK.class)
//public class TitulosPagar implements Serializable{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -4188075285990743008L;
//
//	@Id
//	@Column(name = "PARCELA", nullable = false)
//	private int parcela;
//	
//	@Id
//	@ManyToOne
//	@JoinColumn(name="id_titulo_pagar", nullable=false)
//	private DocEntrada titulo_pagar;
//	
//	@Temporal(TemporalType.DATE)
//	@Column(name = "DT_VENCIMENTO", nullable = false)
//	private Date dt_vencimento;
//
//	@NumberFormat(style = Style.CURRENCY)
//	@Column(name = "VLR_TITULO", nullable = false, precision = 9, scale = 2)
//	private BigDecimal vlr_titulo;
//	
//	@Temporal(TemporalType.DATE)
//	@Column(name = "DT_BAIXA", nullable = true)
//	private Date dt_baixa;
//
//	@NumberFormat(style = Style.CURRENCY)
//	@Column(name = "SALDO", nullable = true, precision = 9, scale = 2)
//	private BigDecimal saldo;
//	
//	@Enumerated(EnumType.STRING)
//	@Column(name = "DEVOLUCAO_TITULO", nullable = true, length=3)
//	private TipoDevolucaoTitulo tipoDevolucaoTitulo;
//
//	public int getParcela() {
//		return parcela;
//	}
//
//	public void setParcela(int parcela) {
//		this.parcela = parcela;
//	}
//
//	public DocEntrada getTitulo_pagar() {
//		return titulo_pagar;
//	}
//
//	public void setTitulo_pagar(DocEntrada titulo_pagar) {
//		this.titulo_pagar = titulo_pagar;
//	}
//
//	public Date getDt_vencimento() {
//		return dt_vencimento;
//	}
//
//	public void setDt_vencimento(Date dt_vencimento) {
//		this.dt_vencimento = dt_vencimento;
//	}
//
//	public BigDecimal getVlr_titulo() {
//		return vlr_titulo;
//	}
//
//	public void setVlr_titulo(BigDecimal vlr_titulo) {
//		this.vlr_titulo = vlr_titulo;
//	}
//
//	public Date getDt_baixa() {
//		return dt_baixa;
//	}
//
//	public void setDt_baixa(Date dt_baixa) {
//		this.dt_baixa = dt_baixa;
//	}
//
//	public BigDecimal getSaldo() {
//		return saldo;
//	}
//
//	public void setSaldo(BigDecimal saldo) {
//		this.saldo = saldo;
//	}
//
//	public TipoDevolucaoTitulo getTipoDevolucaoTitulo() {
//		return tipoDevolucaoTitulo;
//	}
//
//	public void setTipoDevolucaoTitulo(TipoDevolucaoTitulo tipoDevolucaoTitulo) {
//		this.tipoDevolucaoTitulo = tipoDevolucaoTitulo;
//	}
//
//	
//}
//
