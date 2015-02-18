package br.com.fastline.ws_fastline.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fastline.ws_fastline.constantes.TipoOrigem;
import br.com.fastline.ws_fastline.constantes.TipoStatusPedido;
import br.com.fastline.ws_fastline.model.Cliente;
import br.com.fastline.ws_fastline.model.CondPagamento;
import br.com.fastline.ws_fastline.model.Pedido;
import br.com.fastline.ws_fastline.model.Produto;
import br.com.fastline.ws_fastline.repository.ClienteRepository;
import br.com.fastline.ws_fastline.repository.CondPagamentoRepository;
import br.com.fastline.ws_fastline.repository.PedidoRepository;
import br.com.fastline.ws_fastline.repository.ProdutoRepository;

@Service
public class PedidoServiceImpl implements PedidoService {
	
	private static final long serialVersionUID = -3760890073751934885L;
	
	@Autowired
	private PedidoRepository repository;
	
	@Autowired
	private ClienteRepository cliente_repository;

	@Autowired
	private CondPagamentoRepository condPagamento_repository;

	@Autowired
	private ProdutoRepository produto_repository;

	
	@Transactional
	public Response persist(Pedido entity) {
		dados_iniciais(entity);
		return repository.persist(entity);
	}

	public void dados_iniciais(Pedido entity){
		entity.setTipoStatusPedido(TipoStatusPedido.ABERTO);
		entity.setTipoOrigem(TipoOrigem.MOBILE);
		entity.setDt_emissao(new Date());
		entity.setVlr_total(BigDecimal.valueOf(0.00));
		Cliente cliente = cliente_repository.find(entity.getCliente().getId_cliente());
		entity.setCliente(cliente);
		CondPagamento cond = condPagamento_repository.find(entity.getCondpagamento().getId_cond_pagamento());
		entity.setCondpagamento(cond);
		Produto produto = produto_repository.find(entity.getItens_pedidos().get(0).getProduto().getId_produto());
	}
	
	@Transactional
	public Response merge(Pedido entity, Long id) {
		return repository.merge(entity,id);
	}

	@Transactional
	public Response remove(Pedido entity) {
		return repository.remove(entity);
	}

	public Pedido find(Long id) {
		return repository.find(id);
	}

	public List<Pedido> findAll(Long id_cliente) {
		return repository.findAll(id_cliente);
	}
}
