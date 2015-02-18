package br.com.fastline.ws_fastline.ws;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.fastline.ws_fastline.model.CondPagamento;
import br.com.fastline.ws_fastline.service.CondPagamentoService;


@Component
@Path("/cond_pagamento")
public class CondPagamentoResource {
	
	@Autowired
	private CondPagamentoService cond_pagamentoService;

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<CondPagamento> list() {
		return cond_pagamentoService.findAll();
	}

	@GET
	@Path("{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public CondPagamento getItensPedido(@PathParam("id") Long id) {
		return cond_pagamentoService.find(id);
	}
}
