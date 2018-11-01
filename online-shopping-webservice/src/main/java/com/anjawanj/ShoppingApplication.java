package com.anjawanj;


import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@EnableEurekaClient
public class ShoppingApplication {

	
	//protected Logger logger = Logger.getLogger(ShoppingApplication.class.getName());

	
	public static void main(String[] args) {
		

		SpringApplication.run(ShoppingApplication.class, args);
	}
}