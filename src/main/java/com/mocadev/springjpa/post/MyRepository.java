package com.mocadev.springjpa.post;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

/**
 * @author chcjswo
 * @version 1.0.0
 * @since 2020-12-20
 **/
@NoRepositoryBean
public interface MyRepository<T, Id extends Serializable> extends Repository<T, Id> {

	<E extends T> E save(E entity);

	List<T> findAll();

	long count();

	<E extends T> Optional<E> findById(Id id);

}
