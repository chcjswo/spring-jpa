package com.mocadev.springjpa;

import static org.assertj.core.api.Assertions.assertThat;

import com.mocadev.springjpa.post.Comment;
import com.mocadev.springjpa.post.CommentRepository;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author chcjswo
 * @version 1.0.0
 * @since 2020-12-20
 **/
@ExtendWith(SpringExtension.class)
@DataJpaTest
class CommentRepositoryTest {

	@Autowired
	CommentRepository commentRepository;

	@Test
	@DisplayName("Test name")
	void test() throws Exception {
		// given
		Comment comment = new Comment();
		comment.setComment("new comment");
		commentRepository.save(comment);

		// when
		List<Comment> all = commentRepository.findAll();

		// then
		assertThat(all.size()).isEqualTo(1);

		// when
		long count = commentRepository.count();

		// then
		assertThat(count).isEqualTo(1);

		// when
		Optional<Comment> byId = commentRepository.findById(100L);

		// then
		assertThat(byId).isEmpty();

		Comment comment1 = byId.orElseThrow(IllegalArgumentException::new);

		commentRepository.save(null);

	}

	@Test
	@DisplayName("Test name")
	void queryTest() throws Exception {
		// given
		Comment comment = new Comment();
		comment.setComment("new comment");
		commentRepository.save(comment);

		// when
		List<Comment> comments = commentRepository.findByCommentContainsIgnoreCase("New");

		// then
		assertThat(comments.size()).isEqualTo(1);

	}

}