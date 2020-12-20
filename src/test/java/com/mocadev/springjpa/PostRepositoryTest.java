package com.mocadev.springjpa;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.mocadev.springjpa.post.Post;
import com.mocadev.springjpa.post.PostRepository;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author chcjswo
 * @version 1.0.0
 * @since 2020-12-19(019)
 **/
@ExtendWith(SpringExtension.class)
@DataJpaTest
@Import(PostRepositoryTestConfig.class)
class PostRepositoryTest {

	@Autowired
	PostRepository postRepository;

	@Test
	@DisplayName("Test name")
	void test() throws Exception {
		// given
		Post post = new Post();
		post.setTitle("hello jpa");
		assertThat(post.getId()).isNull();

		// when
		Post newPost = postRepository.save(post);

		// then
		assertThat(newPost.getId()).isNotNull();

		// when
		List<Post> posts = postRepository.findAll();
		assertThat(posts.size()).isEqualTo(1);

		// when
		Page<Post> page = postRepository.findAll(PageRequest.of(0, 10));

		// then
		assertThat(page.getTotalElements()).isEqualTo(1);
		assertThat(page.getNumber()).isEqualTo(0);
		assertThat(page.getSize()).isEqualTo(10);
		assertThat(page.getNumberOfElements()).isEqualTo(1);

		// when
		page = postRepository.findByTitleContains("hello", PageRequest.of(0, 10));

		// then
		assertThat(page.getTotalElements()).isEqualTo(1);
		assertThat(page.getNumber()).isEqualTo(0);
		assertThat(page.getSize()).isEqualTo(10);
		assertThat(page.getNumberOfElements()).isEqualTo(1);

		List<Post> myPost = postRepository.findMyPost();
		System.out.println("myPost = " + myPost);

		postRepository.delete(post);
		postRepository.flush();

	}

}