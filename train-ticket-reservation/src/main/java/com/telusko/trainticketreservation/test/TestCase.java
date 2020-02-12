package com.telusko.trainticketreservation.test;




import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.telusko.trainticketreservation.controller.trainController;
import com.telusko.trainticketreservation.model.train;

public class TestCase {

	private trainController testTrain  = new trainController();
	private train tr;
	
	@Before
	public void init() {
		 tr = new train(111, "shatabdi", "CSMT", "Pune", 40);
	}
	
	
	@Test
	public void saveTrain() {
	   testTrain.saveTrain(tr);
	   assertEquals(111,tr.getTrain_no());
	}

	@Test
	public void testGetTrain() {
		assertEquals(0,testTrain.getTrains().size());
	}
	
	@Test
	public void testGetTrainById() {
		assertEquals(tr,testTrain.getTrain(111));
	}
	
	@Test
	public void testDeleteTrain() {
		testTrain.deleteTrain(111);
		assertEquals(false,testTrain.getTrain(111));
	}
}
