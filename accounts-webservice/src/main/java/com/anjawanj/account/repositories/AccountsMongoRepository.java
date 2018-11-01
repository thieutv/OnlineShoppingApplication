package com.anjawanj.account.repositories;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.anjawanj.account.model.Account;
 
public interface AccountsMongoRepository extends MongoRepository<Account, BigInteger> {
    Account findByFirstName(String firstName);
}