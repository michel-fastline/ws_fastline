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
//@Table(name = "TB_CAD_SANGRIA")
//public class Sangria implements Serializable{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -1049943363854878052L;
//
//	@Column(name="ID_SANGRIA")
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sangria_id_seq")
//	@SequenceGenerator(name="sangria_id_seq", sequenceName="sangria_id_sequence", allocationSize=1)
//	private Long id_sangria;
//	
//	@Temporal(TemporalType.DATE)
//	@Column(name = "DT_EMISSAO", nullable = false)
//	private Date dt_emissao;
//	
//	@NumberFormat(style = Style.CURRENCY)
//	@Column(name = "VLR_SANGRIA", nullable = false, precision = 9, scale = 2)
//	private BigDecimal vlr_sangria;
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
//	public Long getId_sangria() {
//		return id_sangria;
//	}
//
//	public void setId_sangria(Long id_sangria) {
//		this.id_sangria = id_sangria;
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
//	public BigDecimal getVlr_sangria() {
//		return vlr_sangria;
//	}
//
//	public void setVlr_sangria(BigDecimal vlr_sangria) {
//		this.vlr_sangria = vlr_sangria;
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
//	
//}
