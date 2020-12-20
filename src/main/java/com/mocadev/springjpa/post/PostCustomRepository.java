package com.mocadev.springjpa.post;

import java.util.List;

/**
 * @author chcjswo
 * @version 1.0.0
 * @since 2020-12-20
 **/
public interface PostCustomRepository<T> {

	List<Post> findMyPost();

	void delete(T entity);

}
