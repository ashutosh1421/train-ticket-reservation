package com.telusko.trainticketreservation.service;

import java.util.List;
import java.util.Optional;

import com.telusko.trainticketreservation.exception.TrainException;
import com.telusko.trainticketreservation.model.train;

public interface TrainServiceImpl  {
	
	public int saveTrai( train trai);
	public List<train> getTrains();
	public Optional<train> getTrain( int id);
	public int deleteTrain(int id) throws TrainException;
	

}
