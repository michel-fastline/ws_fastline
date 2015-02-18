package br.com.fastline.ws_fastline;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.Search;
import org.hibernate.search.query.dsl.QueryBuilder;

import br.com.fastline.ws_fastline.model.Produto;

/**
 * Teste do lucene
 * 
 * @author Edson
 * 
 */
public class TestHibernateSearchMain {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManager entityManager = Persistence.createEntityManagerFactory("WS_FastLinePU").createEntityManager();
		FullTextEntityManager fullTextEntityManager = Search.getFullTextEntityManager(entityManager);
		try {
			fullTextEntityManager.createIndexer().startAndWait();
			QueryBuilder qb = fullTextEntityManager.getSearchFactory().buildQueryBuilder().forEntity(Produto.class).get();
			org.apache.lucene.search.Query query = qb.keyword().onFields("nome", "codigo", "descricao").matching("prod1").createQuery();
			Query jpaQuery = fullTextEntityManager.createFullTextQuery(query, Produto.class);

			List<Produto> prodResult = jpaQuery.getResultList();

			if (prodResult != null) {
				for (Produto produto : prodResult) {
					System.out.println("Produto = " + produto);
				}
			}
			
			

		} catch (InterruptedException e) {
			Logger.getLogger("").log(Level.SEVERE, e.getCause().toString());
		} finally {
			if (fullTextEntityManager != null) {
				fullTextEntityManager.close();
			}
			fullTextEntityManager = null;
		}
	}
}