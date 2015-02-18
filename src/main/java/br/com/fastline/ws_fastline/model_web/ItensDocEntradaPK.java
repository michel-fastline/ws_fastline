//package br.com.fastline.ws_fastline.model_web;
//
//import java.io.Serializable;
//
//import javax.persistence.Embeddable;
//
//import br.com.fastline.ws_fastline.model.Produto;
//
//
//@Embeddable
//public class ItensDocEntradaPK implements Serializable {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -8297520932463214343L;
//	
//	
//	private DocEntrada doc_entrada;
//	
//	
//	private Produto produto;
//
//
//	public DocEntrada getDoc_entrada() {
//		return doc_entrada;
//	}
//
//
//	public void setDoc_entrada(DocEntrada doc_entrada) {
//		this.doc_entrada = doc_entrada;
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
//		result = prime * result
//				+ ((doc_entrada == null) ? 0 : doc_entrada.hashCode());
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
//		ItensDocEntradaPK other = (ItensDocEntradaPK) obj;
//		if (doc_entrada == null) {
//			if (other.doc_entrada != null)
//				return false;
//		} else if (!doc_entrada.equals(other.doc_entrada))
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
