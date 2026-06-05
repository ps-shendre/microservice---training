package com.msedcl.main.service;

import org.springframework.stereotype.Service;

import com.msedcl.main.repository.UserRepository;

//@Service  comment FOR  use java configurATION 
public class UserService {
	private UserRepository userRepository;
	
	
	
	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}



	public void createUser(String name) {
		System.out.println("User created : :" + name);

	}

}
