package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	


	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("surajjindam");
		boolean isValidPassword = password.equalsIgnoreCase("qwerty123");
		
		return isValidUserName && isValidPassword;
	}

}
