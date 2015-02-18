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
import br.com.fastline.ws_fastline.constantes.TipoStatus;

@XmlRootElement
@Entity
@Table(name = "TB_CAD_COND_PAGAMENTO")
public class CondPagamento implements Serializable {

	private static final long serialVersionUID = -2316008272647606545L;

	@Id
	@Column(name="ID_CONDICAO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "condpagamento_id_seq")
	@SequenceGenerator(name="condpagamento_id_seq", sequenceName="condpagamento_id_sequence", allocationSize=1)
	private Long id_cond_pagamento;
	
	@Column(name = "NOME_CONDICAO", nullable = false, length=30)
	private String nome_condicao;

	@Column(name = "FORMA_PAG", nullable = false, length=3)
	private String forma_pag;
	
	@Column(name = "CONDICAO_QTD_DIAS", nullable = false)
	private int condicao_qtd_dias;

	@Column(name = "QTD_TITULOS", nullable = false)
	private int qtd_titulos;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DT_CADASTRO", nullable = false)
	private Date dt_cadastro;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DT_INATIVACAO", nullable = true)
	private Date dt_inativacao;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS", nullable = false, length=7)
	private TipoStatus tipoStatus;
	

	public Long getId_cond_pagamento() {
		return id_cond_pagamento;
	}

	public void setId_cond_pagamento(Long id_cond_pagamento) {
		this.id_cond_pagamento = id_cond_pagamento;
	}

	public String getNome_condicao() {
		return nome_condicao;
	}

	public void setNome_condicao(String nome_condicao) {
		this.nome_condicao = nome_condicao;
	}

	public String getForma_pag() {
		return forma_pag;
	}

	public void setForma_pag(String forma_pag) {
		this.forma_pag = forma_pag;
	}

	public int getCondicao_qtd_dias() {
		return condicao_qtd_dias;
	}

	public void setCondicao_qtd_dias(int condicao_qtd_dias) {
		this.condicao_qtd_dias = condicao_qtd_dias;
	}

	public int getQtd_titulos() {
		return qtd_titulos;
	}

	public void setQtd_titulos(int qtd_titulos) {
		this.qtd_titulos = qtd_titulos;
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

	public TipoStatus getTipoStatus() {
		return tipoStatus;
	}

	public void setTipoStatus(TipoStatus tipoStatus) {
		this.tipoStatus = tipoStatus;
	}

	
}
