package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Exception.CustomerException;
import com.lti.entity.Customer;
import com.lti.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private SendMailService sendMailService; 
	
	public void register(Customer customer) throws CustomerException 
	{
		//add some business logic before adding to the database
		
		customerRepository.addNewCustomer(customer);
		//sendMailService.send(cust.getEmail(),"Thank You", "We thank you for registering with us.");
		//sendMailService.send(customer.getEmailId(), "Registration"," Thank You  for registering with us.");
	}
}