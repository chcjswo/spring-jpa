package com.mocadev.springjpa;

import com.mocadev.springjpa.post.Post;
import com.mocadev.springjpa.post.PostListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chcjswo
 * @version 1.0.0
 * @since 2020-12-20
 **/
@Configuration
public class PostRepositoryTestConfig {

	@Bean
	public PostListener postListener() {
		return new PostListener();
	}

}
