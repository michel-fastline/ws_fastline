//package br.com.fastline.ws_fastline.model_web;
//
//import java.io.Serializable;
//import java.util.Date;
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.xml.bind.annotation.XmlRootElement;
//
//import br.com.fastline.ws_fastline.constantes.TipoStatus;
//
//
//@XmlRootElement
//@Entity
//@Table(name = "TB_CAD_CAIXA")
//public class Caixa implements Serializable{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -6611808730366714851L;
//	
//	@Column(name="ID_CAIXA")
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "caixa_id_seq")
//	@SequenceGenerator(name="caixa_id_seq", sequenceName="caixa_id_sequence", allocationSize=1)
//	private Long id_caixa;
//	
//	@Column(name = "DESCRICAO", nullable = false, length=15)
//	private String descricao;
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
//	@OneToMany(mappedBy = "caixa", targetEntity = MovimentoCaixa.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	private List<MovimentoCaixa> movimento_caixa;
//	
//	public Long getId_caixa() {
//		return id_caixa;
//	}
//
//	public void setId_caixa(Long id_caixa) {
//		this.id_caixa = id_caixa;
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
//	public List<MovimentoCaixa> getMovimento_caixa() {
//		return movimento_caixa;
//	}
//
//	public void setMovimento_caixa(List<MovimentoCaixa> movimento_caixa) {
//		this.movimento_caixa = movimento_caixa;
//	}
//}
