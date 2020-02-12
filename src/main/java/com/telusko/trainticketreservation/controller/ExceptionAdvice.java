package com.telusko.trainticketreservation.controller;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.telusko.trainticketreservation.exception.TrainException;
import com.telusko.trainticketreservation.model.OrderError;

@Aspect
@ControllerAdvice
public class ExceptionAdvice extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(TrainException.class)
	public ResponseEntity<OrderError> mapException(TrainException ex)
	{
		OrderError error=new OrderError(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
		return new ResponseEntity<OrderError>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
