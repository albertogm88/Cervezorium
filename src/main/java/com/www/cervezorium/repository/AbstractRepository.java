package com.www.cervezorium.repository;

import java.lang.reflect.ParameterizedType;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AbstractRepository<T, ID> implements CrudRepository<T, ID> {

	
	private static final int MAX_RESULTS = 15000;

	protected Class<T> entityClass;

	@PersistenceContext
	protected EntityManager em;
	
	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init() {
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
		this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
	}

	
	@Override
	public <S extends T> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends T> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<T> findById(ID id) {
		 return Optional.ofNullable(em.find(entityClass, id));
	}

	@Override
	public boolean existsById(ID id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<T> findAll() {
		CriteriaQuery<T> cq = em.getCriteriaBuilder().createQuery(entityClass);
		cq.from(entityClass);
		return em.createQuery(cq).setMaxResults(MAX_RESULTS).getResultList();
	}

	@Override
	public Iterable<T> findAllById(Iterable<ID> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(ID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends T> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public Iterable<T> findAllPaginate(int firstResult, int pageSize) {
		CriteriaQuery<T> cq = em.getCriteriaBuilder().createQuery(entityClass);
		cq.from(entityClass);
		TypedQuery<T> typedQuery = em.createQuery(cq);
		typedQuery.setFirstResult(firstResult);
		typedQuery.setMaxResults(pageSize);
		return typedQuery.getResultList();
	}

}