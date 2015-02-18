//package br.com.fastline.ws_fastline.model_web;
//
//import java.io.Serializable;
//
//import javax.persistence.Embeddable;
//
//import br.com.fastline.ws_fastline.model.Pedido;
//import br.com.fastline.ws_fastline.model.Produto;
//
//@Embeddable
//public class ItensDevolucaoPedidoPK implements Serializable{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -6448214378002332335L;
//	
//	private Pedido devolucao_pedido;
//	
//	
//	private Produto produto;
//
//
//	public Pedido getDevolucao_pedido() {
//		return devolucao_pedido;
//	}
//
//
//	public void setDevolucao_pedido(Pedido devolucao_pedido) {
//		this.devolucao_pedido = devolucao_pedido;
//	}
//
//
//	public Produto getProduto() {
//		return produto;
//	}
//
//
//	public void setProduto(Produto produto) {
//		this.produto = produto;
//	}
//
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime
//				* result
//				+ ((devolucao_pedido == null) ? 0 : devolucao_pedido.hashCode());
//		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
//		return result;
//	}
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		ItensDevolucaoPedidoPK other = (ItensDevolucaoPedidoPK) obj;
//		if (devolucao_pedido == null) {
//			if (other.devolucao_pedido != null)
//				return false;
//		} else if (!devolucao_pedido.equals(other.devolucao_pedido))
//			return false;
//		if (produto == null) {
//			if (other.produto != null)
//				return false;
//		} else if (!produto.equals(other.produto))
//			return false;
//		return true;
//	}
//	
//	
//}
