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
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.xml.bind.annotation.XmlRootElement;
//
//import org.springframework.format.annotation.NumberFormat;
//import org.springframework.format.annotation.NumberFormat.Style;
//
//import br.com.fastline.ws_fastline.constantes.TipoOrigem;
//import br.com.fastline.ws_fastline.constantes.TipoStatus;
//import br.com.fastline.ws_fastline.model.Cliente;
//import br.com.fastline.ws_fastline.model.CondPagamento;
//import br.com.fastline.ws_fastline.model.Pedido;
//
//@XmlRootElement
//@Entity
//@Table(name = "TB_DEVOLUCAO_PEDIDO")
//public class DevolucaoPedido implements Serializable {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 5627788555983147302L;
//	
//	@Id
//	@OneToOne
//    @JoinColumn(name = "id_devolucao_pedido",nullable=false)
//    private Pedido pedido;
//
//	@ManyToOne
//	@JoinColumn(name="id_cliente", nullable=false)
//	private Cliente cliente;
//	
//	@ManyToOne
//	@JoinColumn(name="id_condicao", nullable=false)
//	private CondPagamento condpagamento;
//	
//	@Enumerated(EnumType.STRING)
//	@Column(name = "ORIGEM", nullable = false, length=7)
//	private TipoOrigem tipoOrigem;
//	
//	@Temporal(TemporalType.DATE)
//	@Column(name = "DT_DEVOLUCAO", nullable = false)
//	private Date dt_devolucao;
//
//	@NumberFormat(style = Style.CURRENCY)
//	@Column(name = "VLR_TOTAL", nullable = false, precision = 9, scale = 2)
//	private BigDecimal vlr_total;
//	
//	@Enumerated(EnumType.STRING)
//	@Column(name = "STATUS", nullable = false, length=7)
//	private TipoStatus tipoStatus;
//	
//	
//	
//	public Pedido getPedido() {
//		return pedido;
//	}
//
//	public void setPedido(Pedido pedido) {
//		this.pedido = pedido;
//	}
//
//	public Cliente getCliente() {
//		return cliente;
//	}
//
//	public void setCliente(Cliente cliente) {
//		this.cliente = cliente;
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
//	public TipoOrigem getTipoOrigem() {
//		return tipoOrigem;
//	}
//
//	public void setTipoOrigem(TipoOrigem tipoOrigem) {
//		this.tipoOrigem = tipoOrigem;
//	}
//
//	public Date getDt_devolucao() {
//		return dt_devolucao;
//	}
//
//	public void setDt_devolucao(Date dt_devolucao) {
//		this.dt_devolucao = dt_devolucao;
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
////	public List<ItensDevolucaoPedido> getItens_devolucao_pedidos() {
////		return itens_devolucao_pedidos;
////	}
////
////	public void setItens_devolucao_pedidos(
////			List<ItensDevolucaoPedido> itens_devolucao_pedidos) {
////		this.itens_devolucao_pedidos = itens_devolucao_pedidos;
////	}
//	
//	
//	
//}
