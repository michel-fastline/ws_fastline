//package br.com.fastline.ws_fastline.model_web;
//
//import java.io.Serializable;
//
//import javax.persistence.Embeddable;
//
//import br.com.fastline.ws_fastline.model.Produto;
//
//@Embeddable
//public class ItensDevolucaoDocEntradaPK implements Serializable{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -6448214378002332335L;
//	
//	private DocEntrada devolucao_doc_entrada;
//	
//	
//	private Produto produto;
//
//
//	public DocEntrada getDevolucao_doc_entrada() {
//		return devolucao_doc_entrada;
//	}
//
//
//	public void setDevolucao_doc_entrada(DocEntrada devolucao_doc_entrada) {
//		this.devolucao_doc_entrada = devolucao_doc_entrada;
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
//				+ ((devolucao_doc_entrada == null) ? 0 : devolucao_doc_entrada
//						.hashCode());
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
//		ItensDevolucaoDocEntradaPK other = (ItensDevolucaoDocEntradaPK) obj;
//		if (devolucao_doc_entrada == null) {
//			if (other.devolucao_doc_entrada != null)
//				return false;
//		} else if (!devolucao_doc_entrada.equals(other.devolucao_doc_entrada))
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
