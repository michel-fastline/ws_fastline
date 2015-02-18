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
//import br.com.fastline.ws_fastline.constantes.TipoPessoa;
//import br.com.fastline.ws_fastline.constantes.TipoStatus;
//
//@XmlRootElement
//@Entity
//@Table(name = "TB_CAD_FORNECEDOR")
//public class Fornecedor implements Serializable {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -3793291715468785425L;
//
//	@Column(name="ID_FORNECEDOR")
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fornecedor_id_seq")
//	@SequenceGenerator(name="fornecedor_id_seq", sequenceName="fornecedor_id_sequence", allocationSize=1)
//	private Long id_fornecedor;
//	
//	@Column(name = "NOME_FORNECEDOR", nullable = false, length=50)
//	private String nome_fornecedor;
//
//	@Enumerated(EnumType.STRING)
//	@Column(name = "TIPO", nullable = false, length=8)
//	private TipoPessoa tipoPessoa;
//
//	@Column(name = "RG_IE", nullable = false, length=12)
//	private String rg_ie;
//	
//	@Column(name = "CGC", nullable = false, length=12)
//	private String cgc;
//	
//	@Column(name = "EMAIL", nullable = true, length=50)
//	private String email;
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
//	@OneToMany(mappedBy = "fornecedor", targetEntity = DocEntrada.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	private List<DocEntrada> doc_entrada;
//
//	@OneToMany(mappedBy = "fornecedor", targetEntity = DevolucaoDocEntrada.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	private List<DevolucaoDocEntrada> devolucao_doc_entradas;
//
//	
//	
//	public Long getId_fornecedor() {
//		return id_fornecedor;
//	}
//
//	public void setId_fornecedor(Long id_fornecedor) {
//		this.id_fornecedor = id_fornecedor;
//	}
//
//	public String getNome_fornecedor() {
//		return nome_fornecedor;
//	}
//
//	public void setNome_fornecedor(String nome_fornecedor) {
//		this.nome_fornecedor = nome_fornecedor;
//	}
//
//	public TipoPessoa getTipoPessoa() {
//		return tipoPessoa;
//	}
//
//	public void setTipoPessoa(TipoPessoa tipoPessoa) {
//		this.tipoPessoa = tipoPessoa;
//	}
//
//	public String getRg_ie() {
//		return rg_ie;
//	}
//
//	public void setRg_ie(String rg_ie) {
//		this.rg_ie = rg_ie;
//	}
//
//	public String getCgc() {
//		return cgc;
//	}
//
//	public void setCgc(String cgc) {
//		this.cgc = cgc;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
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
//	public List<DocEntrada> getDoc_entrada() {
//		return doc_entrada;
//	}
//
//	public void setDoc_entrada(List<DocEntrada> doc_entrada) {
//		this.doc_entrada = doc_entrada;
//	}
//
//	public List<DevolucaoDocEntrada> getDevolucao_doc_entradas() {
//		return devolucao_doc_entradas;
//	}
//
//	public void setDevolucao_doc_entradas(
//			List<DevolucaoDocEntrada> devolucao_doc_entradas) {
//		this.devolucao_doc_entradas = devolucao_doc_entradas;
//	}
//
//	
//	
//}
