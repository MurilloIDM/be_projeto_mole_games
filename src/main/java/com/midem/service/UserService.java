package com.midem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.midem.models.user.User;
import com.midem.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User create(User user) {
		Boolean userAlreadyExists = this.findByName(user.getName());
		
		if (userAlreadyExists) {
			throw new userAlreadyExistsException();
		}
		
		return userRepository.save(user);
	}
	
	public Boolean findByName(String name) {
		List<User> users = userRepository.findAll();
		
		
		for (User userList : users) {			
			if (userList.getName().equalsIgnoreCase(name)) {
				return true;
			}
		}
		
		return false;
	}
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
}
