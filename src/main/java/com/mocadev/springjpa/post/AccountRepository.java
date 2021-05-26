package com.mocadev.springjpa.post;

import com.mocadev.springjpa.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * @author chcjswo
 * @version 1.0.0
 * @since 2020-12-20
 **/
public interface AccountRepository extends JpaRepository<Account, Long>,
	QuerydslPredicateExecutor<Account> {

}
