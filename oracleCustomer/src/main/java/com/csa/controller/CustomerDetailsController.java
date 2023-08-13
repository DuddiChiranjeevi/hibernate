package com.csa.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csa.entities.CustomerDetails;
import com.csa.service.CustomerDetailsService;

@RestController
@RequestMapping("/customer")
public class CustomerDetailsController {
	
	private static final Logger log = LoggerFactory.getLogger(CustomerDetailsController.class);

	@Autowired
	private CustomerDetailsService customerDetailsService;
	@PostMapping
	@RequestMapping("/save")
	public CustomerDetails save(@RequestBody CustomerDetails customerDetails) {
	CustomerDetails customerDetails2=customerDetailsService.save(customerDetails);
	log.info("controller obj:  "+customerDetails2);
		return customerDetails2;	
	}
	@GetMapping
	@RequestMapping("get/{customerId}")
	public Optional<CustomerDetails> getById(@PathVariable("customerId") int customerId) {
		return customerDetailsService.getById(customerId);
	}
	@GetMapping
	@RequestMapping("fetchall")
	public List<CustomerDetails> findAll(){
		return customerDetailsService.findAll();
	}
	
	
	
	@GetMapping
	@RequestMapping("exist/{customerId}")
	public boolean resourceExist(@PathVariable("customerId") int customerId) {
		return customerDetailsService.resourceExist(customerId);
	}
	
	

	@DeleteMapping
	@RequestMapping("{customerId}/delete")
	public void deletedById(@PathVariable("customerId")int customerId ) {
	
		customerDetailsService.deletById(customerId);
		
		log.info("Record deleted with id: "+customerId);
	}
}
