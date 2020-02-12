package com.telusko.trainticketreservation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.telusko.trainticketreservation.model.train;

public interface trainRepository extends MongoRepository<train, Integer>{

}
