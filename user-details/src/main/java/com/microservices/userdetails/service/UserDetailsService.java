package com.microservices.userdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.userdetails.model.UserDetails;
import com.microservices.userdetails.repository.UserDetailsRepository;

@Service
public class UserDetailsService {
	
	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	//post method
	public UserDetails addUser(UserDetails userDetails){
		return userDetailsRepository.save(userDetails);
	}
	
	//get method
	public List<UserDetails> getUser(){
		return userDetailsRepository.findAll();
	}   
	
	
    

}
