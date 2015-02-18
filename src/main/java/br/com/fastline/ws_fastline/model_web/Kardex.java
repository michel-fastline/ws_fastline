//package br.com.fastline.ws_fastline.model_web;
//
//
//
//
//import java.io.Serializable;
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.xml.bind.annotation.XmlRootElement;
//
//import br.com.fastline.ws_fastline.constantes.TipoDocumento;
//import br.com.fastline.ws_fastline.model.Produto;
//
//
//
//
//@XmlRootElement
//@Entity
//@Table(name = "TB_KARDEX")
//public class Kardex implements Serializable{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1678089281651751043L;
//	
//	@Column(name="ID_KARDEX")
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kardex_id_seq")
//	@SequenceGenerator(name="kardex_id_seq", sequenceName="kardex_id_sequence", allocationSize=1)
//	private Long id_kardex;
//	
//	@ManyToOne
//	@JoinColumn(name="id_produto", nullable=false)
//	private Produto produto;
//	
//	@Enumerated(EnumType.STRING)
//	@Column(name = "TIPO_DOC", nullable = false, length=17)
//	private TipoDocumento tipoDocumento;
//	
//	@Column(name = "NUMERO_DOC", nullable = false)
//	private Long numero_doc;
//	
//	@Temporal(TemporalType.DATE)
//	@Column(name = "DT_MOV", nullable = false)
//	private Date dt_mov;
//
//	public Long getId_kardex() {
//		return id_kardex;
//	}
//
//	public void setId_kardex(Long id_kardex) {
//		this.id_kardex = id_kardex;
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
//	public TipoDocumento getTipoDocumento() {
//		return tipoDocumento;
//	}
//
//	public void setTipoDocumento(TipoDocumento tipoDocumento) {
//		this.tipoDocumento = tipoDocumento;
//	}
//
//	public Long getNumero_doc() {
//		return numero_doc;
//	}
//
//	public void setNumero_doc(Long numero_doc) {
//		this.numero_doc = numero_doc;
//	}
//
//	public Date getDt_mov() {
//		return dt_mov;
//	}
//
//	public void setDt_mov(Date dt_mov) {
//		this.dt_mov = dt_mov;
//	}
//	
//		
//}
