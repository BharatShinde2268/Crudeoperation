package com.main.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.User;
import com.main.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/create")
	public User createUser(@RequestBody User user)
	{
		
		
		User createUser = service.createUser(user);
		
		
		return createUser;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable String id)
	{
		service.deleteUser(id);
	}
	@GetMapping("/single/{id}")
	public User getSingle(@PathVariable String id)
	{
		User singleUser = service.getSingleUser(id);
		return singleUser;
	}
	@GetMapping("/all")
	public List<User> getAll()
	{
		List<User> allUsers = service.getAllUsers();
		return allUsers;
	}
	
}
