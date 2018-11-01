package com.anjawanj.microservices.auth.api;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthUserController {

	/**
	 * Return the principal identifying the logged in user
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping("/me")
	@ResponseBody
	public Principal getCurrentLoggedInUser(Principal user) {
		return user;
	}
}
