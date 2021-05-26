package com.mocadev.springjpa;

import java.io.Serializable;
import javax.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

/**
 * @author chcjswo
 * @version 1.0.0
 * @since 2020-12-20
 **/
public class SimpleRepositoryImpl<T, ID extends Serializable> extends
	SimpleJpaRepository<T, ID> implements
	SimpleRepository<T, ID> {

	private EntityManager em;

	public SimpleRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager em) {
		super(entityInformation, em);
		this.em = em;
	}

	@Override
	public boolean contains(T entity) {
		return em.contains(entity);
	}
}
