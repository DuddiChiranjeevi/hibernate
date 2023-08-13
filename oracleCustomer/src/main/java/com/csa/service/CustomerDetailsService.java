package com.csa.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.csa.entities.CustomerDetails;
import com.csa.exceptions.CustomerNotFoundException;
import com.csa.repository.CustomerDetailsRepository;

@Service

public class CustomerDetailsService {

	private static final Logger log = LoggerFactory.getLogger(CustomerDetailsService.class);

	@Autowired
	private CustomerDetailsRepository customerDetailsRepository;


	public CustomerDetails save(CustomerDetails customerDetails) {
		customerDetailsRepository.save(customerDetails);
		log.info("Customer data :::::::::::::" + customerDetails);
		return customerDetails;
	}

	@ExceptionHandler(CustomerNotFoundException.class)
	public Optional<CustomerDetails> getById(int customerId) {
		Optional<CustomerDetails> data = customerDetailsRepository.findById(customerId);
		if (data.isEmpty()) {
			throw new CustomerNotFoundException("Customer not found with this id: " + customerId);
		} else {
			return data;
		}
	}
	
	public List<CustomerDetails> findAll(){
		return customerDetailsRepository.findAll();
	}
	

	public boolean resourceExist(int customerId) {
		return customerDetailsRepository.existsById(customerId);
	}

	public String deletById(int customerId) {

		/*
		 * if(customerDetailsRepository.findById(customerId).isEmpty()) { throw new
		 * CustomerNotFoundException("customer not found with this id :"+customerId);
		 * }else { customerDetailsRepository.deleteById(customerId); return
		 * "customer deleted with id:"+customerId; }
		 */
		if (!resourceExist(customerId)) {
			throw new CustomerNotFoundException("NO DATA FOUND WITH THIS ID: " + customerId);
		} else {
			customerDetailsRepository.deleteById(customerId);
			return "Customer deleted successfully";

		}
	}
}
