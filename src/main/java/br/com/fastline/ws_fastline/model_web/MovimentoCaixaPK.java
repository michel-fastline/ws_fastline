//package br.com.fastline.ws_fastline.model_web;
//
//import java.io.Serializable;
//import java.util.Date;
//
//import javax.persistence.Embeddable;
//
//
//
//@Embeddable
//public class MovimentoCaixaPK implements Serializable {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -8297520932463214343L;
//	
//	
//	private Date dt_movimento;
//	
//	private Caixa caixa;
//
//	public Date getDt_movimento() {
//		return dt_movimento;
//	}
//
//	public void setDt_movimento(Date dt_movimento) {
//		this.dt_movimento = dt_movimento;
//	}
//
//	public Caixa getCaixa() {
//		return caixa;
//	}
//
//	public void setCaixa(Caixa caixa) {
//		this.caixa = caixa;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((caixa == null) ? 0 : caixa.hashCode());
//		result = prime * result
//				+ ((dt_movimento == null) ? 0 : dt_movimento.hashCode());
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
//		MovimentoCaixaPK other = (MovimentoCaixaPK) obj;
//		if (caixa == null) {
//			if (other.caixa != null)
//				return false;
//		} else if (!caixa.equals(other.caixa))
//			return false;
//		if (dt_movimento == null) {
//			if (other.dt_movimento != null)
//				return false;
//		} else if (!dt_movimento.equals(other.dt_movimento))
//			return false;
//		return true;
//	}
//	
//	
//	
//
//		
//}
