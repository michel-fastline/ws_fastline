package br.com.fastline.ws_fastline.repository;

import java.io.Serializable;
import java.util.List;
import javax.ws.rs.core.Response;

public interface Repository<T> extends Serializable {

	public T find(Long id);

	public Response persist(T entity);

	public Response merge(T entity, Long id) ;

	public Response remove(T entity);

	public List<T> findAll();

}
