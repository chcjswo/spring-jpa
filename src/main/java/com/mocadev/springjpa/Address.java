package com.mocadev.springjpa;

import javax.persistence.Embeddable;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog http://mocadev.tistory.com
 * @github http://github.com/chcjswo
 * @since 2021-05-26
 **/
@Embeddable
public class Address {

	private String street;
	private String city;
	private String state;
	private String zipCode;

}
