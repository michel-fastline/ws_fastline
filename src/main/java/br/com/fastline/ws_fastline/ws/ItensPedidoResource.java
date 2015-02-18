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

import br.com.fastline.ws_fastline.model.ItensPedido;
import br.com.fastline.ws_fastline.service.ItensPedidoService;

@Component
@Path("/itens_pedido")
public class ItensPedidoResource {
	
	@Autowired
	private ItensPedidoService itens_pedidoService;

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<ItensPedido> list() {
		return itens_pedidoService.findAll();
	}

	@GET
	@Path("{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public ItensPedido getItensPedido(@PathParam("id") Long id) {
		return itens_pedidoService.find(id);
	}

	@POST
	@Path("/add")
	public void addItensPedido(ItensPedido p) {
		itens_pedidoService.persist(p);
	}

	@PUT
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/edit")
	public Response editItensPedido(ItensPedido p) {
		return itens_pedidoService.merge(p, Long.valueOf("1"));
	}

	@DELETE
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/remove/{id}")
	public Response removeItensPedido(@PathParam("id") Long id) {
		return itens_pedidoService.remove(itens_pedidoService.find(id));
	}
	
}
