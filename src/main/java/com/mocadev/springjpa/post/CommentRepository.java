package com.mocadev.springjpa.post;

import java.util.List;

/**
 * @author chcjswo
 * @version 1.0.0
 * @since 2020-12-20
 **/
public interface CommentRepository extends MyRepository<Comment, Long> {

	Comment save(Comment comment);

	List<Comment> findAll();

	List<Comment> findByCommentContainsIgnoreCase(String keyword);

}
