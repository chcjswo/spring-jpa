package com.mocadev.springjpa.post;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import org.springframework.data.domain.AbstractAggregateRoot;

/**
 * @author chcjswo
 * @version 1.0.0
 * @since 2020-12-19(019)
 **/
@Entity
public class Post extends AbstractAggregateRoot<Post> {

	@Id
	@GeneratedValue
	private Long id;

	private String title;

	@Lob
	private String content;

//	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime created;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public Post publish() {
		this.registerEvent(new PostPublishedEvent(this));

		return this;
	}
}
