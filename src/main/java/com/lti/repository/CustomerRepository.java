package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.Exception.CustomerException;
import com.lti.Interface.CustomerInterface;
import com.lti.entity.Customer;


/**
 * @author Priyanka and Jyoti Dixit
 * @Date 14-11-19
 */

@Component("customerrepo")
public class CustomerRepository implements CustomerInterface
{
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void addNewCustomer(Customer customer) throws CustomerException  
	{
		entityManager.persist(customer);
	}

	@Transactional	
	public void updateNewCustomer(Customer customer) throws CustomerException  
	{
		entityManager.merge(customer);
	}
	
	@Transactional	
	public void deleteNewCustomer(Customer customer) throws CustomerException  
	{
		entityManager.remove(customer);
	}

	
	public List<Customer> getCustomersList() throws CustomerException 
	{
		Query q = entityManager.createQuery("Select c from customer c");
		return q.getResultList();
	}
	
}
