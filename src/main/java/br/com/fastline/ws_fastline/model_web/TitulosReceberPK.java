//package br.com.fastline.ws_fastline.model_web;
//
//import java.io.Serializable;
//
//import javax.persistence.Embeddable;
//
//import br.com.fastline.ws_fastline.model.Pedido;
//
//
//
//@Embeddable
//public class TitulosReceberPK implements Serializable {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -8297520932463214343L;
//	
//	
//	private int parcela;
//	
//	private Pedido titulo_receber;
//
//	public int getParcela() {
//		return parcela;
//	}
//
//	public void setParcela(int parcela) {
//		this.parcela = parcela;
//	}
//
//	public Pedido getTitulo_receber() {
//		return titulo_receber;
//	}
//
//	public void setTitulo_receber(Pedido titulo_receber) {
//		this.titulo_receber = titulo_receber;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + parcela;
//		result = prime * result
//				+ ((titulo_receber == null) ? 0 : titulo_receber.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		TitulosReceberPK other = (TitulosReceberPK) obj;
//		if (parcela != other.parcela)
//			return false;
//		if (titulo_receber == null) {
//			if (other.titulo_receber != null)
//				return false;
//		} else if (!titulo_receber.equals(other.titulo_receber))
//			return false;
//		return true;
//	}
//	
//	
//
//		
//}
