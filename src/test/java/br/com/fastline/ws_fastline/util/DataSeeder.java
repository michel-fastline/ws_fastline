package br.com.fastline.ws_fastline.util;

import java.math.BigDecimal;

import br.com.fastline.ws_fastline.constantes.TipoStatus;
import br.com.fastline.ws_fastline.model.Cliente;
import br.com.fastline.ws_fastline.model.Pedido;
import br.com.fastline.ws_fastline.model.Produto;
/**
 * A simple data seeder for domain objects.
 * 
 * @author Edson Rosati
 * 
 */
public class DataSeeder {

	
	public static Produto  getProduto() {
		Produto prod = new Produto();
		prod.setNome_produto("nome");
		prod.setTipoStatus(TipoStatus.ATIVO);
		prod.setPreco(BigDecimal.TEN);
		return prod;
	}
	
//	public static Cliente getCliente(){
//		Cliente cli = new Cliente();
//		cli.setNome_cliente("Michel Teste");
//		cli.setEmail("michel.@agsa");
//		return cli;
//	}
	
	public static Pedido getPedido(){
		Pedido ped = new Pedido();
		//ped.setStatus("WEB");
		//ped.setCliente(DataSeeder.getCliente());
		return ped;
	}

}
