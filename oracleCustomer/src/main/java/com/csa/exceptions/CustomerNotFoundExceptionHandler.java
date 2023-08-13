package com.csa.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerNotFoundExceptionHandler {
@ExceptionHandler(value= {CustomerNotFoundException.class})
	public ResponseEntity<Object> handleCustomerNotFoundException(CustomerNotFoundException customerNotFoundException){
		
		CustomerException customerException=new CustomerException(customerNotFoundException.getMessage(),customerNotFoundException.getCause());
		
		
		return new ResponseEntity<Object>(customerException, HttpStatus.NOT_FOUND);
		
	}
}
