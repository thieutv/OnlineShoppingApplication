package com.anjawanj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.anjawanj.account.model.Account;
import com.anjawanj.account.model.Address;
import com.anjawanj.account.repositories.AccountsMongoRepository;

@EnableEurekaClient
@SpringBootApplication
public class AccountsApplication /*implements CommandLineRunner*/{
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}
	
/*	@Override
	public void run(String... strings) throws Exception {
		
		final Account account = new Account("Sarikha", "Jha", "sareeeere@gmail.com", 44, new Address("Ganesh", "Khin", "sds", "bnc", "cc", "sds"), "34344223232");
		accountsMongoRepository.save(account);
		
		System.out.println("Find by first name");
		Account account1 = accountsMongoRepository.findByFirstName("Sarikha");
		System.out.println(account1);
		
		
	}*/
}