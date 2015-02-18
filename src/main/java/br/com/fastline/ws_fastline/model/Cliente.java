package br.com.fastline.ws_fastline.model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import br.com.fastline.ws_fastline.constantes.TipoOrigem;
import br.com.fastline.ws_fastline.constantes.TipoStatus;


@XmlRootElement
@Entity
@Table(name = "TB_CAD_CLIENTE")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1678089281651751043L;
	
	@Column(name="ID_CLIENTE")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_id_seq")
	@SequenceGenerator(name="cliente_id_seq", sequenceName="cliente_id_sequence", allocationSize=1)
	private Long id_cliente;
	
	@Column(name = "NOME_CLIENTE", nullable = false, length=50)
	private String nome_cliente;

	@Column(name = "NUMERO_CEL", nullable = false, length=20)
	private String numero_cel;
	
	@Column(name = "EMAIL", nullable = false, length=40)
	private String email;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_PRIMEIRA_COMPRA", nullable = true)
	private Date dt_primeira_compra;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DT_ULTIMA_COMPRA", nullable = true)
	private Date dt_ultima_compra;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DT_CADASTRO", nullable = false)
	private Date dt_cadastro;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ORIGEM", nullable = false, length=7)
	private TipoOrigem tipoOrigem;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DT_INATIVACAO", nullable = true)
	private Date dt_inativacao;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS", nullable = false, length=7)
	private TipoStatus tipoStatus;
	
	public Long getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNome_cliente() {
		return nome_cliente;
	}
	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	public String getNumero_cel() {
		return numero_cel;
	}
	public void setNumero_cel(String numero_cel) {
		this.numero_cel = numero_cel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public TipoOrigem getTipoOrigem() {
		return tipoOrigem;
	}
	public void setTipoOrigem(TipoOrigem tipoOrigem) {
		this.tipoOrigem = tipoOrigem;
	}
	public TipoStatus getTipoStatus() {
		return tipoStatus;
	}
	public void setTipoStatus(TipoStatus tipoStatus) {
		this.tipoStatus = tipoStatus;
	}	
	public Date getDt_primeira_compra() {
		return dt_primeira_compra;
	}
	public void setDt_primeira_compra(Date dt_primeira_compra) {
		this.dt_primeira_compra = dt_primeira_compra;
	}
	public Date getDt_ultima_compra() {
		return dt_ultima_compra;
	}
	public void setDt_ultima_compra(Date dt_ultima_compra) {
		this.dt_ultima_compra = dt_ultima_compra;
	}
	public Date getDt_cadastro() {
		return dt_cadastro;
	}
	public void setDt_cadastro(Date dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}
	public Date getDt_inativacao() {
		return dt_inativacao;
	}
	public void setDt_inativacao(Date dt_inativacao) {
		this.dt_inativacao = dt_inativacao;
	}
	
}
