package com.mocadev.springjpa.post;

import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author chcjswo
 * @version 1.0.0
 * @since 2020-12-20
 **/
@Repository
@Transactional
public class PostCustomRepositoryImpl implements PostCustomRepository {

	@Autowired
	EntityManager em;

	@Override
	public List<Post> findMyPost() {
		System.out.println("PostCustomRepositoryImpl.findMyPost");
		return em.createQuery("select p from Post as p", Post.class)
			.getResultList();
	}

	@Override
	public void delete(Object entity) {
		System.out.println("PostCustomRepositoryImpl.delete");
		em.remove(entity);
	}
}
