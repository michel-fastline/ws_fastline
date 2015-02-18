package br.com.fastline.ws_fastline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.fastline.ws_fastline.model.CondPagamento;
import br.com.fastline.ws_fastline.repository.CondPagamentoRepository;


@Service
public class CondPagamentoServiceImpl implements CondPagamentoService{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5268958511685830550L;
	
	@Autowired
	private CondPagamentoRepository repository;

	public CondPagamento find(Long id) {
		return repository.find(id);
	}

	public List<CondPagamento> findAll() {
		return repository.findAll();
	}
}
