package com.mocadev.springjpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author chcjswo
 * @version 1.0.0
 * @since 2020-12-19(019)
 **/
@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Account account = new Account();
		account.setUsername("test");
		account.setPassword("1111");

		Study study = new Study();
		study.setName("JPA");

		account.addStudy(study);

		Session session = entityManager.unwrap(Session.class);
		session.save(account);
		session.save(study);
	}
}
