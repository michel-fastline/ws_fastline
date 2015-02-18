package br.com.fastline.ws_fastline.repository;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.fastline.ws_fastline.model.Pedido;

@Repository
public class PedidoRepository extends GenericRepository<Pedido> {
	
	private static final long serialVersionUID = -6964564835047125948L;
	
	public List<Pedido> findAll(Long id_cliente) {
		Query consulta = entityManager.createQuery("FROM Pedido p WHERE p.id_pedido = :id_cliente");
		consulta.setParameter("id_cliente", id_cliente);
		return consulta.getResultList();
	}

}
