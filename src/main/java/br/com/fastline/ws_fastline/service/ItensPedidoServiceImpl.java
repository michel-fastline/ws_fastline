package br.com.fastline.ws_fastline.service;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fastline.ws_fastline.model.ItensPedido;
import br.com.fastline.ws_fastline.repository.ItensPedidoRepository;

@Service
public class ItensPedidoServiceImpl implements ItensPedidoService {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4637017635028470662L;
	
	@Autowired
	private ItensPedidoRepository repository;

	@Transactional
	public Response persist(ItensPedido entity) {
		 return repository.persist(entity);
	}

	@Transactional
	public Response merge(ItensPedido entity, Long id) {
		return repository.merge(entity,id);
	}

	@Transactional
	public Response remove(ItensPedido entity) {
		return repository.remove(entity);
	}

	public ItensPedido find(Long id) {
		return repository.find(id);
	}

	public List<ItensPedido> findAll() {
		return repository.findAll();
	}

}
