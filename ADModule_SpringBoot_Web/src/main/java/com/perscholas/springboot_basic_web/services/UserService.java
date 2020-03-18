package com.perscholas.springboot_basic_web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perscholas.springboot_basic_web.models.User;
import com.perscholas.springboot_basic_web.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public Integer createUser(User user) {
		User newUser = userRepository.save(user);
		return newUser.getUserId();
	}
	
	public User findByEmail(String email) {
		User user = userRepository.findByEmail(email);
		return user;
	}

}
