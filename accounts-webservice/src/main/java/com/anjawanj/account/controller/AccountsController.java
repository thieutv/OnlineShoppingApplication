package com.anjawanj.account.controller;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anjawanj.account.model.Account;
import com.anjawanj.account.repositories.AccountsMongoRepository;


/**
 * A RESTFul controller for accessing account information.
 * 
 * @author Anup Jawanjal
 */
@RestController
@RequestMapping(value = "/account/api/v1/accounts")
public class AccountsController {
	
	@Autowired
	AccountsMongoRepository accountsMongoRepository;

	//protected Logger logger = Logger.getLogger(AccountsController.class
		//	.getName());
	//protected AccountRepository accountRepository;

	/**
	 * Create an instance plugging in the respository of Accounts.
	 * 
	 * @param accountRepository
	 *            An account repository implementation.
	 */
	/*@Autowired
	public AccountsController(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;

		logger.info("AccountRepository says system has "
				+ accountRepository.countAccounts() + " accounts");
	}*/

	/**
	 * Fetch an account with the specified account number.
	 * 
	 * @param accountNumber
	 *            A numeric, 9 digit account number.
	 * @return The account if found.
	 * @throws AccountNotFoundException
	 *             If the number is not recognised.
	 */
	@RequestMapping("/{accountNumber}")
	public Account byNumber(@PathVariable("accountNumber") String firstName) {

		//logger.info("accounts-service byNumber() invoked: " + accountNumber);
		//Account account = new Account();
		
		Account account = accountsMongoRepository.findByFirstName(firstName);
		//logger.info("accounts-service byNumber() found: " + account);

		
			return account;
		
	}
}