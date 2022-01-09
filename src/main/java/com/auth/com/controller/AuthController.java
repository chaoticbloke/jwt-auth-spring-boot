package com.auth.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.com.Service.AuthService;
import com.auth.com.dto.LoginRequest;
import com.auth.com.dto.RegisterRequest;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
	private AuthService authService;
	
	//SLF4J stands for Simple Logging Facade for Java. 
	//Creating the Logger object
   
	
	@PostMapping("/signup")
	public ResponseEntity<Object> signup(@RequestBody RegisterRequest registerRequest) {
		authService.signup(registerRequest);
		
		return  new ResponseEntity<>(HttpStatus.OK);
		
	}
	
	
	@PostMapping("/login")
	public ResponseEntity<Object> login(@RequestBody LoginRequest loginRequest){
		authService.login(loginRequest);
		
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
