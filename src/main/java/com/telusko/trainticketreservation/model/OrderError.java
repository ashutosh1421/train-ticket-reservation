package com.telusko.trainticketreservation.model;

public class OrderError {
	
	private int errorCode;
	private String errorMessage;
	public OrderError(int errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	public OrderError() {
		super();
	}
	
	

}
