package com.telusko.trainticketreservation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.telusko.trainticketreservation.model.user;

public interface userRepository extends MongoRepository<user, Integer>{

}
