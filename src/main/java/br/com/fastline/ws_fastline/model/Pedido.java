package br.com.fastline.ws_fastline.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import br.com.fastline.ws_fastline.constantes.TipoOrigem;
import br.com.fastline.ws_fastline.constantes.TipoStatusPedido;

@XmlRootElement
@XmlAccessorType(value = XmlAccessType.FIELD) 
@Entity
@Table(name = "TB_PEDIDO")
public class Pedido implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7197145998526831907L;

	@Column(name="ID_PEDIDO")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido_id_seq")
	@SequenceGenerator(name="pedido_id_seq", sequenceName="pedido_id_sequence", allocationSize=1)
	private Long id_pedido;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(referencedColumnName="id_cliente", name="id_cliente")
	private Cliente cliente;

	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(referencedColumnName="id_condicao", name="id_condicao")
	private CondPagamento condpagamento;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_EMISSAO", nullable = false)
	private Date dt_emissao;

	@NumberFormat(style = Style.CURRENCY)
	@Column(name = "VLR_TOTAL", nullable = false, precision = 9, scale = 2)
	private BigDecimal vlr_total;

	@Enumerated(EnumType.STRING)
	@Column(name = "ORIGEM", nullable = false, length=7)
	private TipoOrigem tipoOrigem;

	@Temporal(TemporalType.TIME)
	@Column(name = "RETIRADA", nullable = true)
	private Date retirada;

	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS", nullable = false, length=11)
	private TipoStatusPedido tipoStatusPedido;

	@ElementCollection(targetClass=ItensPedido.class)
	@OneToMany(mappedBy = "pedido", targetEntity = ItensPedido.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ItensPedido> itens_pedidos;
	

	public void setId_pedido(Long id_pedido) {
		this.id_pedido = id_pedido;
	}

	public Long getId_pedido() {
		return id_pedido;
	}

	public TipoOrigem getTipoOrigem() {
		return tipoOrigem;
	}
	public void setTipoOrigem(TipoOrigem tipoOrigem) {
		this.tipoOrigem = tipoOrigem;
	}

	public TipoStatusPedido getTipoStatusPedido() {
		return tipoStatusPedido;
	}

	public void setTipoStatusPedido(TipoStatusPedido tipoStatusPedido) {
		this.tipoStatusPedido = tipoStatusPedido;
	}

	public Date getDt_emissao() {
		return dt_emissao;
	}
	public void setDt_emissao(Date dt_emissao) {
		this.dt_emissao = dt_emissao;
	}
	public BigDecimal getVlr_total() {
		return vlr_total;
	}
	public void setVlr_total(BigDecimal vlr_total) {
		this.vlr_total = vlr_total;
	}
	public Date getRetirada() {
		return retirada;
	}
	public void setRetirada(Date retirada) {
		this.retirada = retirada;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public CondPagamento getCondpagamento() {
		return condpagamento;
	}

	public void setCondpagamento(CondPagamento condpagamento) {
		this.condpagamento = condpagamento;
	}

	public List<ItensPedido> getItens_pedidos() {
		return itens_pedidos;
	}

	public void setItens_pedidos(List<ItensPedido> itens_pedidos) {
		this.itens_pedidos = itens_pedidos;
	}

}
