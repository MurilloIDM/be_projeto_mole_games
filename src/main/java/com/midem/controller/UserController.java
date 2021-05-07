package com.midem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.midem.models.User;
import com.midem.models.dto.UserLoginResponse;
import com.midem.models.dto.UserResponse;
import com.midem.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping
	public UserResponse create(@RequestBody	User user) {
		return userService.create(user);
	}
	
	@GetMapping
	public List<UserResponse> listAll() {
		return userService.findAll();
	}
	
	@GetMapping("/login")
	public UserLoginResponse findUser(@RequestParam String name, @RequestParam String password) {
		return userService.findUser(name, password);
	}
	
}
