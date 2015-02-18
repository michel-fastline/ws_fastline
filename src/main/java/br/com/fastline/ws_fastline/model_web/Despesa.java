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
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.xml.bind.annotation.XmlRootElement;
//
//import org.springframework.format.annotation.NumberFormat;
//import org.springframework.format.annotation.NumberFormat.Style;
//
//import br.com.fastline.ws_fastline.constantes.TipoStatus;
//
//@XmlRootElement
//@Entity
//@Table(name = "TB_CAD_DESPESA")
//public class Despesa implements Serializable{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -1722320953002693771L;
//
//	@Column(name="ID_DESPESA")
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "despesa_id_seq")
//	@SequenceGenerator(name="despesa_id_seq", sequenceName="despesa_id_sequence", allocationSize=1)
//	private Long id_despesa;
//	
//	@Column(name = "DESCRICAO", nullable = false, length=30)
//	private String descricao;
//	
//	@NumberFormat(style = Style.CURRENCY)
//	@Column(name = "VLR_DESPESA", nullable = false, precision = 9, scale = 2)
//	private BigDecimal vlr_despesa;
//	
//	@Temporal(TemporalType.DATE)
//	@Column(name = "DT_EMISAO", nullable = false)
//	private Date dt_emissao;
//	
//	@Column(name = "OBSERVACAO", nullable = true, length=50)
//	private String observacao;
//	
//	@Temporal(TemporalType.DATE)
//	@Column(name = "DT_CADASTRO", nullable = false)
//	private Date dt_cadastro;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name = "DT_INATIVACAO", nullable = true)
//	private Date dt_inativacao;
//
//	@Enumerated(EnumType.STRING)
//	@Column(name = "STATUS", nullable = false, length=7)
//	private TipoStatus tipoStatus;
//
//	public Long getId_despesa() {
//		return id_despesa;
//	}
//
//	public void setId_despesa(Long id_despesa) {
//		this.id_despesa = id_despesa;
//	}
//
//	public String getDescricao() {
//		return descricao;
//	}
//
//	public void setDescricao(String descricao) {
//		this.descricao = descricao;
//	}
//
//	public BigDecimal getVlr_despesa() {
//		return vlr_despesa;
//	}
//
//	public void setVlr_despesa(BigDecimal vlr_despesa) {
//		this.vlr_despesa = vlr_despesa;
//	}
//
//	public Date getDt_emissao() {
//		return dt_emissao;
//	}
//
//	public void setDt_emissao(Date dt_emissao) {
//		this.dt_emissao = dt_emissao;
//	}
//
//	public String getObservacao() {
//		return observacao;
//	}
//
//	public void setObservacao(String observacao) {
//		this.observacao = observacao;
//	}
//
//	public Date getDt_cadastro() {
//		return dt_cadastro;
//	}
//
//	public void setDt_cadastro(Date dt_cadastro) {
//		this.dt_cadastro = dt_cadastro;
//	}
//
//	public Date getDt_inativacao() {
//		return dt_inativacao;
//	}
//
//	public void setDt_inativacao(Date dt_inativacao) {
//		this.dt_inativacao = dt_inativacao;
//	}
//
//	public TipoStatus getTipoStatus() {
//		return tipoStatus;
//	}
//
//	public void setTipoStatus(TipoStatus tipoStatus) {
//		this.tipoStatus = tipoStatus;
//	}
//
//	
//}
