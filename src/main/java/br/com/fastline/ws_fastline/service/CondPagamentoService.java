package br.com.fastline.ws_fastline.service;

import java.io.Serializable;
import java.util.List;

import br.com.fastline.ws_fastline.model.CondPagamento;


public interface CondPagamentoService extends Serializable{
	
	public CondPagamento find(Long id);

	public List<CondPagamento> findAll();
}
