package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Users;
import com.nt.request.LoginRequest;
import com.nt.service.UserService;



@RestController
public class UsersController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/addUser") 
	@CrossOrigin(origins = "http://localhost:4200")
	public Users addUser(@RequestBody Users user) {
		System.out.println(user.getMobile());
		System.out.println(user.getEmail());
		return userService.addUser(user);
	}
	
	  @PostMapping("/loginUser")
	  @CrossOrigin(origins = "http://localhost:4200")
	    public Object loginUser(@RequestBody LoginRequest loginRequest) {
	        return userService.loginUser(loginRequest);
	    }
	

}