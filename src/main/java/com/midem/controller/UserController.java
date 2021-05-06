package com.midem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.midem.models.user.User;
import com.midem.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping
	public User create(@RequestBody	User user) {
		return userService.create(user);
	}
	
	@GetMapping
	public List<User> listAll() {
		return userService.findAll();
	}
	
	@GetMapping("/a")
	public Boolean listByName(@RequestParam String name) {
		return userService.findByName(name);
	}
}
