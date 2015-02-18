package br.com.fastline.ws_fastline.repository;

import java.sql.Time;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.fastline.ws_fastline.model.Produto;

@Repository
public class ProdutoRepository extends GenericRepository<Produto> {

	private static final long serialVersionUID = 3700888382325540826L;

	@SuppressWarnings("unchecked")
	public List<Produto> findAll() {
		return entityManager.createQuery ("from Produto p where p.saldo_disponivel > 0 and p.tipoVendaMobile= 'SIM' and p.tipoStatus = 'ATIVO'").getResultList();
	}
	
//	public Time findTempoProducao(Long id) {
//		Query consulta = entityManager.createQuery("FROM Produto p WHERE p.id_produto = :id");
//		consulta.setParameter("id", id);
//		Produto produto = (Produto) consulta.getSingleResult();
//		return produto.getTempo_producao();
//		//		return entityManager.createQuery ("from Produto p where p.saldo_disponivel > 0 and p.tipoVendaMobile= 'SIM' and p.tipoStatus = 'ATIVO'").getResultList();
//	}
	
	
	public void empenho_desempenhoProduto(Long id, int qtd_reservado, int qtd_disponivel) {
		Query update = entityManager.createQuery("update Produto set reservado = :qtd_reservado , saldo_disponivel = :qtd_disponivel where id_produto = :id");
		update.setParameter("id", id);
		update.setParameter("qtd_reservado", qtd_reservado);
		update.setParameter("qtd_disponivel", qtd_disponivel);
		update.executeUpdate();
	}
	
	public void baixa_estornoProduto(Long id, int saldo_estoque, int qtd_reservado, int qtd_disponivel) {
		Query update = entityManager.createQuery("update Produto set saldo_estoque = :saldo_estoque, reservado = :qtd_reservado , saldo_disponivel = :qtd_disponivel where id_produto = :id");
		update.setParameter("id", id);
		update.setParameter("saldo_estoque", saldo_estoque);
		update.setParameter("qtd_reservado", qtd_reservado);
		update.setParameter("qtd_disponivel", qtd_disponivel);
		update.executeUpdate();
	}
	
}
