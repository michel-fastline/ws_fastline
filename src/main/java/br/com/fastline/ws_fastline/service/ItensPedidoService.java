package br.com.fastline.ws_fastline.service;

import java.io.Serializable;
import java.util.List;

import javax.ws.rs.core.Response;

import br.com.fastline.ws_fastline.model.ItensPedido;

public interface ItensPedidoService extends Serializable {
	
	public Response persist(ItensPedido entity);

	public Response merge(ItensPedido entity, Long id);

	public Response remove(ItensPedido entity);

	public ItensPedido find(Long id);

	public List<ItensPedido> findAll();
}
