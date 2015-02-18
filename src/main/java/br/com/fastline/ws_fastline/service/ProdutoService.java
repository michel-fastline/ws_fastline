package br.com.fastline.ws_fastline.service;

import java.io.Serializable;
import java.util.List;

import javax.ws.rs.core.Response;

import br.com.fastline.ws_fastline.model.Produto;

public interface ProdutoService extends Serializable {

	public Produto find(Long id);

	public List<Produto> findAll();
	
//	public Time findTempoProducao(Long id);
	
	public Response empenharProduto(Long id, int qtd);
	
	public Response desempenharProduto(Long id, int qtd);
	
	public Response baixarProduto(Long id, int qtd);
	
	public Response estornarProduto(Long id, int qtd);
	
}
