package com.mocadev.springjpa;

import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

/**
 * Account
 *
 * @author chcjswo
 * @version 1.0.0
 * @since 2020-12-18(018)
 **/
@Entity
@Getter
@Setter
public class Account {

	@Id
	@GeneratedValue
	private Long id;

	private String username;

	private String password;

//	private String firstname;
//	private String lastname;

//	@Embedded
//	@AttributeOverrides({
//		@AttributeOverride(name = "street", column = @Column(name = "home_street"))
//	})
//	private Address homeAddress;

	@OneToMany(mappedBy = "owner")
	private Set<Study> studies;

	public void addStudy(Study study) {
		this.getStudies().add(study);
		study.setOwner(this);
	}
	public void removeStudy(Study study) {
		this.getStudies().remove(study);
		study.setOwner(null);
	}

}
