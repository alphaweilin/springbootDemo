package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public List<User> getAllUser() {
		return userService.getAll();
	}
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return userService.save(user);
	}
	
	@DeleteMapping("/user")
	public void delUser(@RequestBody User user) {
		userService.delete(user);
	}

}
