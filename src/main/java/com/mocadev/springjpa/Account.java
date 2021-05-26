package com.mocadev.springjpa;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Account
 *
 * @author chcjswo
 * @version 1.0.0
 * @since 2020-12-18(018)
 **/
@Entity
public class Account {

	@Id
	@GeneratedValue
	private Long id;

	private String username;

	private String password;

	private String firstname;
	private String lastname;

	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "street", column = @Column(name = "home_street"))
	})
	private Address homeAddress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
