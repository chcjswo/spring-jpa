package com.mocadev.springjpa.post;

;
import static org.assertj.core.api.Assertions.assertThat;

import com.mocadev.springjpa.Account;
import com.mocadev.springjpa.QAccount;
import com.querydsl.core.types.Predicate;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author chcjswo
 * @version 1.0.0
 * @since 2020-12-20
 **/
@ExtendWith(SpringExtension.class)
@DataJpaTest
class AccountRepositoryTest {

	@Autowired
	AccountRepository accountRepository;

	@Test
	@DisplayName("Test name")
	void test() throws Exception {
		// given
		QAccount account = QAccount.account;
		Predicate predicate = account.username.containsIgnoreCase("jpa")
			.and(account.password.startsWith("1111"));

		// when
		Optional<Account> one = accountRepository.findOne(predicate);

		// then
		assertThat(one).isEmpty();
	}
}