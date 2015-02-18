package br.com.fastline.ws_fastline.service;

import java.io.Serializable;
import java.util.List;

import javax.ws.rs.core.Response;

import br.com.fastline.ws_fastline.model.Cliente;


public interface ClienteService  extends Serializable {
	
	public Response persist(Cliente entity);

	public Response merge(Cliente entity, Long id);
	
	public Response inativar(Cliente entity, Long id);
	
	public Response ativar(Cliente entity, Long id);

	public Response remove(Cliente entity);

	public Cliente find(Long id);

	public List<Cliente> findAll();

}
