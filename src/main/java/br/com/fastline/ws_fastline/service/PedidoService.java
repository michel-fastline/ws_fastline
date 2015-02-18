package br.com.fastline.ws_fastline.service;

import java.io.Serializable;
import java.util.List;

import javax.ws.rs.core.Response;

import br.com.fastline.ws_fastline.model.Pedido;


public interface PedidoService extends Serializable {
	
	public Response persist(Pedido entity);

	public Response merge(Pedido entity, Long id);

	public Response remove(Pedido entity);

	public Pedido find(Long id);

	public List<Pedido> findAll(Long id_cliente);

}
