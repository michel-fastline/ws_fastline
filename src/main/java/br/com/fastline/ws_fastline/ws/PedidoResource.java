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

import br.com.fastline.ws_fastline.model.Pedido;
import br.com.fastline.ws_fastline.service.PedidoService;

@Component
@Path("/pedido")
public class PedidoResource {


	@Autowired
	private PedidoService pedidoService;

	@GET
	@Path("lista/{id_cliente}")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Pedido> list(@PathParam("id_cliente") Long id_cliente) {
		return pedidoService.findAll(id_cliente);
	}

	@GET
	@Path("{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Pedido getPedido(@PathParam("id") Long id) {
		return pedidoService.find(id);
	}

	@POST
	@Path("/add")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response addPedido(Pedido p) {
		return pedidoService.persist(p);
	}

	@PUT
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/edit")
	public Response editPedido(Pedido p) {
		return pedidoService.merge(p, p.getId_pedido());
	}

	@DELETE
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/remove/{id}")
	public Response removePedido(@PathParam("id") Long id) {
		return pedidoService.remove(pedidoService.find(id));
	}

}
