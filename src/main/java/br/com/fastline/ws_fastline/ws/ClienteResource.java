package br.com.fastline.ws_fastline.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fastline.ws_fastline.model.Cliente;
import br.com.fastline.ws_fastline.service.ClienteService;


@Component
@Path("/cliente")
public class ClienteResource {
	@Autowired
	private ClienteService clienteService;

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Cliente> list() {
		return clienteService.findAll();
	}

	@GET
	@Path("{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Cliente getClienteteste(@PathParam("id") Long id) {
		return clienteService.find(id);
	}

	@POST
	@Path("/add")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response addCliente(Cliente p) {
		return clienteService.persist(p);
	}

	@PUT
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/edit")
	public Response editCliente(Cliente p) {
		return clienteService.merge(p, p.getId_cliente());
	}

	@DELETE
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/remove/{id}")
	public Response removeCliente(@PathParam("id") Long id){
		return clienteService.remove(clienteService.find(id));
	}
	
	@PUT
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/inativar")
	public Response inativarCliente(Cliente p) {
		return clienteService.inativar(p, p.getId_cliente());
	}
	
	@PUT
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/ativar")
	public Response ativarCliente(Cliente p) {
		return clienteService.ativar(p, p.getId_cliente());
	}

}
