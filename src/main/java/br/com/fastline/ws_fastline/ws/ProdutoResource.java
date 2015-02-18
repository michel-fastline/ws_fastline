package br.com.fastline.ws_fastline.ws;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fastline.ws_fastline.model.Produto;
import br.com.fastline.ws_fastline.service.ProdutoService;

@Component
@Path("/produto")
public class ProdutoResource {

	@Autowired
	private ProdutoService produtoService;

	@GET  
	@Path("/imagem/{id}")
	@Produces("image/png")  
	public byte[] produces (@PathParam("id") Long id) throws IOException{
		Produto produto = produtoService.find(id);
		File file = new File(produto.getCaminho_imagem());  
		FileInputStream fis = new FileInputStream(file);  
		byte[] data = new byte[fis.available()];  
		fis.read(data);  
		fis.close();
		return data;  
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Produto> list() {
		return produtoService.findAll();
	}

	@GET
	@Path("{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Produto getProduto(@PathParam("id") Long id) {
		return produtoService.find(id);
	}
	
//	@GET
//	@Path("/producao/{id}")
//	@Produces({ MediaType.APPLICATION_JSON })
//	public Time getTempoProducao(@PathParam("id") Long id) {
//		return produtoService.findTempoProducao(id);
//	}

	@PUT
	@Path("/producao/{id}/empenho/{qtd}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response empenharProduto(@PathParam("id") Long id,@PathParam("qtd") int qtd ) {
		return produtoService.empenharProduto(id,qtd);
	}
	
	@PUT
	@Path("/producao/{id}/desempenho/{qtd}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response desempenharProduto(@PathParam("id") Long id,@PathParam("qtd") int qtd ) {
		return produtoService.desempenharProduto(id,qtd);
	}
	
	@PUT
	@Path("/producao/{id}/baixar/{qtd}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response baixarProduto(@PathParam("id") Long id,@PathParam("qtd") int qtd ){
		return produtoService.baixarProduto(id,qtd);
	}
	
	@PUT
	@Path("/producao/{id}/estornar/{qtd}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response estornarProduto(@PathParam("id") Long id,@PathParam("qtd") int qtd ){
		return produtoService.estornarProduto(id,qtd);
	}

}