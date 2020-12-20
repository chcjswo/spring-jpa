package com.mocadev.springjpa;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author chcjswo
 * @version 1.0.0
 * @since 2020-12-20
 **/
@NoRepositoryBean
public interface SimpleRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {

	boolean contains(T entity);

}
