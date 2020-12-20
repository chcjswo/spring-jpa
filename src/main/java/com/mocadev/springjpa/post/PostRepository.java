package com.mocadev.springjpa.post;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chcjswo
 * @version 1.0.0
 * @since 2020-12-19(019)
 **/
public interface PostRepository extends JpaRepository<Post, Long>, PostCustomRepository<Post> {
//public interface PostRepository extends MyRepository<Post, Long> {

	Page<Post> findByTitleContains(String title, Pageable pageable);

	long countByTitleContains(String title);

}
