package com.mocadev.springjpa.post;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author chcjswo
 * @version 1.0.0
 * @since 2020-12-20
 **/
@Component
public class PostListener {

	@EventListener
	public void onApplicationEvent(PostPublishedEvent event) {
		System.out.println("=================================");
		System.out.println(event.getPost().getContent() + " is published.");
		System.out.println("=================================");
	}
}
