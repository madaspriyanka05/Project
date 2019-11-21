package com.lti.Interface;

/**
 * @author Priyanka Madas and Jyoti Dixit
 * @Date 14-11-19
 */


import java.util.List;

import com.lti.Exception.CustomerException;
import com.lti.entity.Customer;



public interface CustomerInterface
{
	public void addNewCustomer(Customer carPart) throws CustomerException;
	public void updateNewCustomer(Customer carPart) throws CustomerException;

	public void deleteNewCustomer(Customer carPart) throws CustomerException;

	
	public List<Customer> getCustomersList() throws CustomerException;
}
