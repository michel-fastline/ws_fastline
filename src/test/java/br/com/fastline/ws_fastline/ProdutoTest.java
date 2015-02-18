//package br.com.fastline.ws_fastline;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//
//import java.util.List;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.annotation.Rollback;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.transaction.TransactionConfiguration;
//import org.springframework.transaction.annotation.Transactional;
//
//import br.com.fastline.ws_fastline.model.Produto;
//import br.com.fastline.ws_fastline.service.ProdutoService;
//import br.com.fastline.ws_fastline.util.DataSeeder;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@Transactional
//@TransactionConfiguration(transactionManager = "transactionManager")
//@ContextConfiguration(locations = { "classpath:**/applicationContextTest.xml" })
//public class ProdutoTest {
//
//	@Autowired
//	private ProdutoService produtoService;
//
//	private Produto prod;
//
//	@Before
//	public void setup() {
//		prod = DataSeeder.getProduto();
//	}
//
//	@Test
//	@Rollback
//	public void testFindAll() {
//		produtoService.persist(prod);
//		assertEquals(1, produtoService.findAll().size());
//	}
//
//	@Test
//	@Rollback
//	public void testPersist() {
//		produtoService.persist(prod);
//		assertEquals("nome", produtoService.findAll().get(0).getNome_produto());
//	}
//
//	@Test
//	@Rollback
//	public void testMerge() {
//		produtoService.persist(prod);
//		Long id = prod.getId_produto();
//		Produto renamedAccount = produtoService.find(id);
//		renamedAccount.setNome_produto("New Name");
//		produtoService.merge(renamedAccount);
//		assertEquals("New Name", produtoService.find(id).getNome_produto());
//	}
//
//	@Test
//	@Rollback
//	public void testRemove() {
//		produtoService.persist(prod);
//		Integer id = prod.getId_produto();
//		produtoService.remove(produtoService.find(id));
//		assertEquals(0, produtoService.findAll().size());
//	}
//
//	@Test
//	@Rollback
//	public void testFind() {
//		produtoService.persist(prod);
//		Integer id = prod.getId_produto();
//		assertNotNull(produtoService.find(id));
//	}
//
//	@Test
//	@Rollback
//	public void testSearch() {
//		produtoService.persist(prod);
//		List<Produto> l = produtoService.find("nome");
//		assertNotNull(l);
//	}
//
//	@After
//	public void tearDown() {
//		// SecurityContextHolder.clearContext();
//	}
//}
