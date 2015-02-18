//package br.com.fastline.ws_fastline.model_web;
//
//import java.io.Serializable;
//import java.math.BigDecimal;
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
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
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
//import br.com.fastline.ws_fastline.model.CondPagamento;
//
//
//
//@XmlRootElement
//@Entity
//@Table(name = "TB_DOC_ENTRADA")
//public class DocEntrada implements Serializable{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -1849232416043882039L;
//
//	@Column(name="ID_DOC_ENTRADA")
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doc_entrada_id_seq")
//	@SequenceGenerator(name="doc_entrada_id_seq", sequenceName="doc_entrada_id_sequence", allocationSize=1)
//	private Long id_doc_entrada;
//	
//	@ManyToOne
//	@JoinColumn(name="id_fornecedor", nullable=false)
//	private Fornecedor fornecedor;
//	
//	@ManyToOne
//	@JoinColumn(name="id_condicao", nullable=false)
//	private CondPagamento condpagamento;
//	
//	@Temporal(TemporalType.DATE)
//	@Column(name = "DT_ENTRADA", nullable = false)
//	private Date dt_entrada;
//	
//	@NumberFormat(style = Style.CURRENCY)
//	@Column(name = "VLR_TOTAL", nullable = false, precision = 9, scale = 2)
//	private BigDecimal vlr_total;
//
//	@Enumerated(EnumType.STRING)
//	@Column(name = "STATUS", nullable = false, length=7)
//	private TipoStatus tipoStatus;
//
//	@OneToMany(mappedBy = "doc_entrada", targetEntity = ItensDocEntrada.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	private List<ItensDocEntrada> itens_doc_entrada;
//	
//	@OneToOne(mappedBy = "doc_entrada")
//    private DevolucaoDocEntrada devolucao_doc_entrada;
//	
//	@OneToMany(mappedBy = "devolucao_doc_entrada", targetEntity = ItensDevolucaoDocEntrada.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	private List<ItensDevolucaoDocEntrada> itens_devolucao_doc_entradas;
//	
//	@OneToMany(mappedBy = "titulo_pagar", targetEntity = TitulosPagar.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	private List<TitulosPagar> titulos_pagar;
//	
//	
//	public Long getId_doc_entrada() {
//		return id_doc_entrada;
//	}
//
//	public void setId_doc_entrada(Long id_doc_entrada) {
//		this.id_doc_entrada = id_doc_entrada;
//	}
//
//	public Fornecedor getFornecedor() {
//		return fornecedor;
//	}
//
//	public void setFornecedor(Fornecedor fornecedor) {
//		this.fornecedor = fornecedor;
//	}
//
//	public CondPagamento getCondpagamento() {
//		return condpagamento;
//	}
//
//	public void setCondpagamento(CondPagamento condpagamento) {
//		this.condpagamento = condpagamento;
//	}
//
//	public Date getDt_entrada() {
//		return dt_entrada;
//	}
//
//	public void setDt_entrada(Date dt_entrada) {
//		this.dt_entrada = dt_entrada;
//	}
//
//	public BigDecimal getVlr_total() {
//		return vlr_total;
//	}
//
//	public void setVlr_total(BigDecimal vlr_total) {
//		this.vlr_total = vlr_total;
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
//	public List<ItensDocEntrada> getItens_doc_entrada() {
//		return itens_doc_entrada;
//	}
//
//	public void setItens_doc_entrada(List<ItensDocEntrada> itens_doc_entrada) {
//		this.itens_doc_entrada = itens_doc_entrada;
//	}
//
//	public DevolucaoDocEntrada getDevolucao_doc_entrada() {
//		return devolucao_doc_entrada;
//	}
//
//	public void setDevolucao_doc_entrada(DevolucaoDocEntrada devolucao_doc_entrada) {
//		this.devolucao_doc_entrada = devolucao_doc_entrada;
//	}
//
//	public List<ItensDevolucaoDocEntrada> getItens_devolucao_doc_entradas() {
//		return itens_devolucao_doc_entradas;
//	}
//
//	public void setItens_devolucao_doc_entradas(
//			List<ItensDevolucaoDocEntrada> itens_devolucao_doc_entradas) {
//		this.itens_devolucao_doc_entradas = itens_devolucao_doc_entradas;
//	}
//	
//
//}
