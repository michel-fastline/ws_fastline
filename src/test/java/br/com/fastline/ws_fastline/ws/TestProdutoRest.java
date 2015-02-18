package br.com.fastline.ws_fastline.ws;

import static org.junit.Assert.assertNotNull;

import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.junit.Before;
import org.junit.Test;

import br.com.fastline.ws_fastline.model.Produto;
import br.com.fastline.ws_fastline.util.DataSeeder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 * Necessário estar com a aplicação rodando
 * 
 * @author Edson
 * 
 */
public class TestProdutoRest {

	protected static Produto p = null;

	ClientConfig config = new DefaultClientConfig();
	Client client = Client.create(config);
	WebResource service = client.resource(getBaseURI());

	@Before
	public void before() {
		p = DataSeeder.getProduto();
	}

	@Test
	public void getList() {
		String s = service.path("api").path("produto").accept(MediaType.APPLICATION_JSON).get(String.class);
		assertNotNull(s);
	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8080/ws_fastline").build();
	}

}
