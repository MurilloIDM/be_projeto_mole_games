package com.midem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.midem.models.User;
import com.midem.models.dto.UserLoginResponse;
import com.midem.models.dto.UserResponse;
import com.midem.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public UserResponse create(User user) {
		Boolean userAlreadyExists = this.findByName(user.getName());
		
		if (userAlreadyExists) {
			throw new UserAlreadyExistsException();
		}
		
		
		User userSave = userRepository.save(user);
		UserResponse userResponse = new UserResponse(userSave.getId(), userSave.getName());
		
		return userResponse;
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
	
	public List<UserResponse> findAll() {
		List<UserResponse> users = new ArrayList<UserResponse>();
		List<User> usersQuery = userRepository.findAll();
		
		for (User user : usersQuery) {
			users.add(new UserResponse(user.getId(), user.getName()));
		}
		
		return users;
	}
	
	public UserLoginResponse findUser(String name, String password) {
		List<User> users = userRepository.findAll();
		
		for (User user : users) {
			if (user.getName().equals(name) && user.getPassword().equals(password)) {
				return new UserLoginResponse(true, user.getId(), user.getName());
			}
		}
		
		return new UserLoginResponse(false);
	}
}
