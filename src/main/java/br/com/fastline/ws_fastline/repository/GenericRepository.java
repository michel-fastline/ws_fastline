package br.com.fastline.ws_fastline.repository;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.orm.hibernate4.HibernateJdbcException;

public class GenericRepository<T> implements Repository<T> {
	Logger log = Logger.getLogger("");

	private static final long serialVersionUID = -6153496179921799859L;

	protected Class<T> clazz;

	protected EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public GenericRepository() {
		this.clazz = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public T find(Long id) {
		return entityManager.find(clazz, id);
	}

	public Response persist(T entity) {
		try{
			entityManager.persist(entity);
			return Response.status(Status.CREATED).build();
		}
		catch(HibernateJdbcException e){	
			return Response.status(Status.NO_CONTENT).build();
		}

	}

	public Response merge(T entity,Long id) {
		if (entityManager.find(clazz, id) != null){
			entityManager.merge(entity);
			return Response.status(Status.OK).build();
		}
		else{
			return Response.status(Status.NO_CONTENT).build();
		}
	}



	public Response remove(T entity) {
		if (entity != null){
			entityManager.remove(entity);
			return Response.status(Status.OK).build();
		}
		else{
			return Response.status(Status.NO_CONTENT).build();
		}
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return entityManager.createQuery("Select t from " + clazz.getSimpleName() + " t ").getResultList();
	}
}
