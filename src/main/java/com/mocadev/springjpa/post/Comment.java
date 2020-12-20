package com.mocadev.springjpa.post;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author chcjswo
 * @version 1.0.0
 * @since 2020-12-20
 **/
@Entity
public class Comment {

	@Id @GeneratedValue
	private Long id;

	private String comment;

	private Integer likeCount = 0;

	public Integer getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
