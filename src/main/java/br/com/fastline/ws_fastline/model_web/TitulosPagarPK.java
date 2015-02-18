//package br.com.fastline.ws_fastline.model_web;
//
//import java.io.Serializable;
//
//import javax.persistence.Embeddable;
//
//
//
//@Embeddable
//public class TitulosPagarPK implements Serializable {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -8297520932463214343L;
//	
//	
//	private int parcela;
//	
//	private DocEntrada titulo_pagar;
//
//	public int getParcela() {
//		return parcela;
//	}
//
//	public void setParcela(int parcela) {
//		this.parcela = parcela;
//	}
//
//	public DocEntrada getTitulo_pagar() {
//		return titulo_pagar;
//	}
//
//	public void setTitulo_pagar(DocEntrada titulo_pagar) {
//		this.titulo_pagar = titulo_pagar;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + parcela;
//		result = prime * result
//				+ ((titulo_pagar == null) ? 0 : titulo_pagar.hashCode());
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
//		TitulosPagarPK other = (TitulosPagarPK) obj;
//		if (parcela != other.parcela)
//			return false;
//		if (titulo_pagar == null) {
//			if (other.titulo_pagar != null)
//				return false;
//		} else if (!titulo_pagar.equals(other.titulo_pagar))
//			return false;
//		return true;
//	}
//	
//	
//
//		
//}
