package br.com.fastline.ws_fastline.model;


import java.io.Serializable;
import java.math.BigDecimal;
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

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import br.com.fastline.ws_fastline.constantes.TipoEstNegativo;
import br.com.fastline.ws_fastline.constantes.TipoStatus;
import br.com.fastline.ws_fastline.constantes.TipoVendaMobile;

@XmlRootElement
@Entity
@Table(name = "TB_CAD_PRODUTO")
public class Produto implements Serializable {

	private static final long serialVersionUID = -7356351216242122750L;
	
	@Column(name="ID_PRODUTO")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_id_seq")
	@SequenceGenerator(name="produto_id_seq", sequenceName="produto_id_sequence", allocationSize=1)
	private Long id_produto;
	
	@Column(name = "CAMINHO_IMAGEM", nullable = false, length=100)
	private String caminho_imagem;
	
	@Column(name = "NOME_PRODUTO", nullable = false, length=50)
	private String nome_produto;
	
	@NumberFormat(style = Style.CURRENCY)
	@Column(name = "PRECO", nullable = false, precision = 9, scale = 2)
	private BigDecimal preco;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DT_INATIVACAO", nullable = true)
	private Date dt_inativacao;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DT_CADASTRO", nullable = true)
	private Date dt_cadastro;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DT_ULTIMA_COMPRA", nullable = true)
	private Date dt_ultima_compra;
	
	@Column(name = "SALDO_ESTOQUE", nullable = false)
	private int saldo_estoque;
	
	@Column(name = "UM", nullable = false, length=2)
	private String um;
	
	@NumberFormat(style = Style.CURRENCY)
	@Column(name = "CUSTO", nullable = false, precision = 9, scale = 2)
	private BigDecimal custo;
	
	@Column(name = "ESTOQUE_MINIMO", nullable = true)
	private int estoque_minimo;
	
	@Column(name = "SALDO_DISPONIVEL", nullable = false)
	private int saldo_disponivel;
	
	@Column(name = "RESERVADO", nullable = false)
	private int reservado;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "FG_ACEITA_EST_NEGATIVO", nullable = false, length=3)
	private TipoEstNegativo tipoEstNegativo;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "FG_MOBILE", nullable = false, length=3)
	private TipoVendaMobile tipoVendaMobile;
	
	@Temporal(TemporalType.TIME)
	@Column(name = "TEMPO_PRODUCAO", nullable = true)
	private Date tempo_producao;
	
		
	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS", nullable = false, length=7)
	private TipoStatus tipoStatus;
	
	public Long getId_produto() {
		return id_produto;
	}

	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
	}

	public String getCaminho_imagem() {
		return caminho_imagem;
	}

	public void setCaminho_imagem(String caminho_imagem) {
		this.caminho_imagem = caminho_imagem;
	}
	
	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Date getDt_inativacao() {
		return dt_inativacao;
	}

	public void setDt_inativacao(Date dt_inativacao) {
		this.dt_inativacao = dt_inativacao;
	}

	public Date getDt_cadastro() {
		return dt_cadastro;
	}

	public void setDt_cadastro(Date dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}

	public Date getDt_ultima_compra() {
		return dt_ultima_compra;
	}

	public void setDt_ultima_compra(Date dt_ultima_compra) {
		this.dt_ultima_compra = dt_ultima_compra;
	}

	public int getSaldo_estoque() {
		return saldo_estoque;
	}

	public void setSaldo_estoque(int saldo_estoque) {
		this.saldo_estoque = saldo_estoque;
	}

	public String getUm() {
		return um;
	}

	public void setUm(String um) {
		this.um = um;
	}

	public BigDecimal getCusto() {
		return custo;
	}

	public void setCusto(BigDecimal custo) {
		this.custo = custo;
	}

	public int getEstoque_minimo() {
		return estoque_minimo;
	}

	public void setEstoque_minimo(int estoque_minimo) {
		this.estoque_minimo = estoque_minimo;
	}

	public int getSaldo_disponivel() {
		return saldo_disponivel;
	}

	public void setSaldo_disponivel(int saldo_disponivel) {
		this.saldo_disponivel = saldo_disponivel;
	}

	public int getReservado() {
		return reservado;
	}

	public void setReservado(int reservado) {
		this.reservado = reservado;
	}

	
	public TipoEstNegativo getTipoEstNegativo() {
		return tipoEstNegativo;
	}

	public void setTipoEstNegativo(TipoEstNegativo tipoEstNegativo) {
		this.tipoEstNegativo = tipoEstNegativo;
	}

	public TipoVendaMobile getTipoVendaMobile() {
		return tipoVendaMobile;
	}

	public void setTipoVendaMobile(TipoVendaMobile tipoVendaMobile) {
		this.tipoVendaMobile = tipoVendaMobile;
	}


	public Date getTempo_producao() {
		return tempo_producao;
	}

	public void setTempo_producao(Date tempo_producao) {
		this.tempo_producao = tempo_producao;
	}

	public TipoStatus getTipoStatus() {
		return tipoStatus;
	}

	public void setTipoStatus(TipoStatus tipoStatus) {
		this.tipoStatus = tipoStatus;
	}

}
