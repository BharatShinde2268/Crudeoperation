package com.main.service;

import java.util.List;

import com.main.model.User;

public interface UserService {

	// create 
	
	public User createUser(User user);
	
	// delete 
	
	public void deleteUser(String id);
	
	// get single 
	public User getSingleUser(String id);
	
	// get all 
	
	public List<User> getAllUsers();
	
}
