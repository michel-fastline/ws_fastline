package br.com.fastline.ws_fastline.ws;

import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

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
public class TestWSMain {

	public static void main(String[] args) {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());

		System.out.println(service.path("api").path("produto").path("add").accept(MediaType.APPLICATION_JSON).post(String.class, DataSeeder.getProduto()));
	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8080/ws_fastline").build();
	}

}
