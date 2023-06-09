package com.microservices.userdetails.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservices.userdetails.model.UserDetails;

@Repository
public interface UserDetailsRepository extends MongoRepository<UserDetails, Integer>{

}
