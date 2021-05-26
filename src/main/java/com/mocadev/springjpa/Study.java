package com.mocadev.springjpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog http://mocadev.tistory.com
 * @github http://github.com/chcjswo
 * @since 2021-05-27
 **/
@Entity
@Getter
@Setter
public class Study {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@ManyToOne
	private Account owner;

}
