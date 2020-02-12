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
import com.telusko.trainticketreservation.model.train;
import com.telusko.trainticketreservation.repository.trainRepository;

@RestController
public class trainController {
	
	@Autowired
	private trainRepository repository;
	
	@PostMapping("/addTrain")
	public String saveTrain(@RequestBody train train)
	{
		repository.save(train);
		return "Added train with number"+ train.getTrain_no();
	}
	
	@GetMapping("/findAllTrains")
	public List<train> getTrains()
	{
		return repository.findAll();
	}
	
	@GetMapping("/findAllTrains/{id}")
	public Optional<train> getTrain(@PathVariable int id)
	{
		return repository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteTrain(@PathVariable int id)
	{
		repository.deleteById(id);
		return "Train deleted with number :"+ id; 
	}

}
