package br.com.fastline.ws_fastline.service;

import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fastline.ws_fastline.model.Produto;
import br.com.fastline.ws_fastline.repository.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	private static final long serialVersionUID = -4426535779548042524L;

	@Autowired
	private ProdutoRepository repository;

	public Produto find(Long id) {
		return repository.find(id);
	}

	public List<Produto> findAll() {
		return repository.findAll();
	}

//	@Override
//	public Time findTempoProducao(Long id) {
//		return repository.findTempoProducao(id);
//	}

	@Transactional
	public Response empenharProduto(Long id, int qtd) {
		Produto produto = repository.find(id);
		int disponivel = produto.getSaldo_disponivel();
		int reservado = produto.getReservado();
		int saldo_estoque = produto.getSaldo_estoque();
		if((qtd <= disponivel) && (qtd > 0)){
			reservado = reservado + qtd;
			disponivel = saldo_estoque - reservado;
			repository.empenho_desempenhoProduto(id, reservado, disponivel);
			return Response.ok().build();
		}else{
			return Response.status(Status.NO_CONTENT).build();
		}
			
	}

	@Transactional
	public Response desempenharProduto(Long id, int qtd){
		Produto produto = repository.find(id);
		int disponivel = produto.getSaldo_disponivel();
		int reservado = produto.getReservado();
		int saldo_estoque = produto.getSaldo_estoque();
		if((qtd <= reservado) && (qtd > 0)){
			reservado = reservado - qtd;
			disponivel = saldo_estoque - reservado;
			repository.empenho_desempenhoProduto(id, reservado, disponivel);
			return Response.ok().build();
		}else{
			return Response.status(Status.NO_CONTENT).build();
		}
	}

	@Transactional
	public Response baixarProduto(Long id, int qtd){
		Produto produto = repository.find(id);
		int disponivel = produto.getSaldo_disponivel();
		int reservado = produto.getReservado();
		int saldo_estoque = produto.getSaldo_estoque();
		if((qtd <= reservado) && (qtd > 0)){
			saldo_estoque = saldo_estoque - qtd;
			reservado = reservado - qtd;
			disponivel = saldo_estoque - reservado;
			repository.baixa_estornoProduto(id, saldo_estoque, reservado, disponivel);
			return Response.ok().build();
		}else{
			return Response.status(Status.NO_CONTENT).build();
		}
	}

	@Transactional
	public Response estornarProduto(Long id, int qtd){
		Produto produto = repository.find(id);
		int disponivel = produto.getSaldo_disponivel();
		int reservado = produto.getReservado();
		int saldo_estoque = produto.getSaldo_estoque();
		if (qtd > 0){
			saldo_estoque = saldo_estoque + qtd;
			disponivel = saldo_estoque - reservado;
			repository.baixa_estornoProduto(id, saldo_estoque, reservado, disponivel);
			return Response.ok().build();
		}else{
			return Response.status(Status.NO_CONTENT).build();
		}
	}

}
