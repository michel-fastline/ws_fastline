//package br.com.fastline.ws_fastline.model_web;
//
//import java.io.Serializable;
//import java.util.Date;
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.JoinColumn;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.xml.bind.annotation.XmlRootElement;
//
//import br.com.fastline.ws_fastline.constantes.TipoStatus;
//import br.com.fastline.ws_fastline.model.Produto;
//
//
//@XmlRootElement
////@XmlSeeAlso({ CondPagamento.class })
//@Entity
//@Table(name = "TB_KIT_PROMOCAO")
//public class KitPromocao implements Serializable{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -5203732836643780777L;
//
//	
//	@Id
//	@Column(name="ID_KIT")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kitpromocao_id_seq")
//	@SequenceGenerator(name="kitpromocao_id_seq", sequenceName="kitpromocao_id_sequence", allocationSize=1)
//	private Long id_kit;
//	
//	@Column(name = "DESCRICAO", nullable = false, length=50)
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
//	@ManyToMany 
//	@JoinTable(name="tb_itens_kit_promocao", joinColumns= 
//		{@JoinColumn(name="id_kit", nullable=false)}, inverseJoinColumns= 
//		{@JoinColumn(name="id_produto", nullable=false)}) 
//	private List<Produto> produtos;
//
//
//	
//	
//	public Long getId_kit() {
//		return id_kit;
//	}
//
//	public void setId_kit(Long id_kit) {
//		this.id_kit = id_kit;
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
//	public List<Produto> getProdutos() {
//		return produtos;
//	}
//
//	public void setProdutos(List<Produto> produtos) {
//		this.produtos = produtos;
//	}
//	
//}
