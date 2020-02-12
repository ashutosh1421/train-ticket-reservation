package com.telusko.trainticketreservation.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "Trains")
public class train {
	
	@Id
	int train_no;
	String name;
	String origin;
	String destination;
	int seats;
	
	public train(int train_no, String name, String origin, String destination, int seats) {
		super();
		this.train_no = train_no;
		this.name = name;
		this.origin = origin;
		this.destination = destination;
		this.seats = seats;
	}
	
	public train() {
		super();
	}

	public int getTrain_no() {
		return train_no;
	}
	public void setTrain_no(int train_no) {
		this.train_no = train_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "train [train_no=" + train_no + ", name=" + name + ", origin=" + origin + ", destination=" + destination
				+ ", seats=" + seats + "]";
	}
	
	

}
