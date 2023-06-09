package com.microservices.userdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.userdetails.model.UserDetails;
import com.microservices.userdetails.service.UserDetailsService;

@RestController
@RequestMapping("/userdetails")
public class UserDetailsController {
	
	@Autowired
    private UserDetailsService userDetailsService;
    
    @GetMapping("/all")
    public List<UserDetails> getAllUsers(){
    	return userDetailsService.getUser();
    }
    
    @PostMapping
    public UserDetails addUser(@RequestBody UserDetails userDetails) {
    	return userDetailsService.addUser(userDetails);
    }
}

