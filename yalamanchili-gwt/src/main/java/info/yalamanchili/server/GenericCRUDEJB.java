package info.yalamanchili.server;

import info.yalamanchili.gwt.beans.TableObj;

import java.util.List;

public interface GenericCRUDEJB<T> {
	public T create(T entity);

	public T read(T entity, Long id);

	public T update(T entity);

	public void delete(T entity);

	public TableObj getTableObj(T entity, int start);

	public List<T> getAllEntities(T entity);


	public List<T> getEntities(T entity);
}
