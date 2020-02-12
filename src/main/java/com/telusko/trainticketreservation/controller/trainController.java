package com.telusko.trainticketreservation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.trainticketreservation.exception.TrainException;
import com.telusko.trainticketreservation.model.train;
import com.telusko.trainticketreservation.service.TrainServiceImpl;

@RestController
public class trainController {
	
	@Autowired(required=true)
	public TrainServiceImpl repo;
	
	@PostMapping("/addTrain")
	public String saveTrain(@RequestBody train train)
	{
		int id=repo.saveTrai(train);
		return "Added train with number"+ id;
	}
	
	@GetMapping("/findAllTrains")
	public List<train> getTrains()
	{
		return repo.getTrains();
	}
	
	@GetMapping("/findAllTrains/{id}")
	public Optional<train> getTrain(@PathVariable int id)
	{
		return repo.getTrain(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteTrain(@PathVariable int id) throws TrainException
	{
		int id1=repo.deleteTrain(id);
		return "Train deleted with number :"+ id1; 
	}

}
