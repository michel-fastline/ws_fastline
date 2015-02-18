package br.com.fastline.ws_fastline.service;

import java.util.Date;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fastline.ws_fastline.constantes.TipoOrigem;
import br.com.fastline.ws_fastline.constantes.TipoStatus;
import br.com.fastline.ws_fastline.model.Cliente;
import br.com.fastline.ws_fastline.repository.ClienteRepository;


@Service
public class ClienteServiceImpl implements ClienteService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6774648671888108338L;

	@Autowired
	private ClienteRepository repository;

	@Transactional
	public Response persist(Cliente entity) {
		dados_iniciais(entity);
		return repository.persist(entity);
	}

	public void dados_iniciais(Cliente entity){
		entity.setTipoStatus(TipoStatus.ATIVO);
		entity.setTipoOrigem(TipoOrigem.MOBILE);
		entity.setDt_cadastro(new Date());
	}

	@Transactional
	public Response inativar(Cliente entity, Long id){
		Cliente clienteOrigin = repository.find(id);
		if (clienteOrigin != null){
			entity.setDt_cadastro(clienteOrigin.getDt_cadastro());
			entity.setTipoOrigem(clienteOrigin.getTipoOrigem());
			entity.setDt_inativacao(new Date());
			entity.setTipoStatus(TipoStatus.INATIVO);
			return repository.merge(entity, id);
		}
		else{
			return Response.status(Status.NO_CONTENT).build();
		}
	}

	@Transactional
	public Response ativar(Cliente entity, Long id){
		Cliente clienteOrigin = repository.find(id);
		if (clienteOrigin != null){
			entity.setDt_cadastro(clienteOrigin.getDt_cadastro());
			entity.setTipoOrigem(clienteOrigin.getTipoOrigem());
			entity.setDt_inativacao(null);
			entity.setTipoStatus(TipoStatus.ATIVO);
			return repository.merge(entity, id);
		}
		else{
			return Response.status(Status.NO_CONTENT).build();
		}
	}

	@Transactional
	public Response merge(Cliente entity, Long id) {
		Cliente clienteOrigin = repository.find(id);
		if (clienteOrigin != null){
			entity.setDt_cadastro(clienteOrigin.getDt_cadastro());
			entity.setTipoOrigem(clienteOrigin.getTipoOrigem());
			entity.setTipoStatus(clienteOrigin.getTipoStatus());
			return repository.merge(entity,id);
		}
		else{
			return Response.status(Status.NO_CONTENT).build();
		}

	}

	@Transactional
	public Response remove(Cliente entity) {
		return repository.remove(entity);
	}

	public Cliente find(Long id) {
		return repository.find(id);
	}

	public List<Cliente> findAll() {
		return repository.findAll();
	}

}
