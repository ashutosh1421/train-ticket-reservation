package com.telusko.trainticketreservation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.telusko.trainticketreservation.exception.TrainException;
import com.telusko.trainticketreservation.model.train;
import com.telusko.trainticketreservation.repository.trainRepository;
import com.telusko.trainticketreservation.service.TrainServiceImpl;

@Service
@Transactional
public class TrainService implements TrainServiceImpl {
	
	@Autowired(required=true)
	public trainRepository repository;
	
	public int saveTrai( train trai)
	{
		repository.save(trai);
		return trai.getTrain_no();
	}
	
	
	public List<train> getTrains()
	{
		return repository.findAll();
	}
	
	public Optional<train> getTrain( int id)
	{
		return repository.findById(id);
	}
	
	
	public int deleteTrain(int id) throws TrainException
	{
		
		try {
		repository.deleteById(id);
		
		} catch(Exception e) {
			throw new TrainException("Train not found with ID : " + id);
		}
		return id; 
	}
	
	

}
