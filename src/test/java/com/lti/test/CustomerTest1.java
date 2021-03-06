package com.lti.test;

import java.time.LocalDate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.Exception.CustomerException;
import com.lti.Interface.CustomerInterface;
import com.lti.entity.Customer;
import com.lti.repository.CustomerRepository;

/**
 * @author Jyoti
 *
 */
public class CustomerTest1 {

     @Test
	public void customertest() 
	{
		 ApplicationContext ctx= new   ClassPathXmlApplicationContext("app-config.xml");
		   CustomerInterface  cp=(CustomerInterface)  ctx.getBean("customerrepo");
		   //Entity or models  instances are  not created using Spring
		   Customer c=new Customer();
		   
		  try
		  {
			  cp.addNewCustomer(c);
		  }
		  catch( CustomerException e){System.out.println(""+e);}
		  
		  
//		  try 
//		  {
//			  
//			   List<Customer> list=new ArrayList<Customer>();
//			  list=cp.getCustomersList();
//				for(Customer a1 :list)
//				 {
//					 	System.out.println(a1.getCustId()+"\n"+a1.getCustFname()+"\n"+a1.getCustMname()+"\n"+a1.getCustLname()
//					 	+"\n"+a1.getCustAadhar()+"\n"+a1.getCustEmailId()+"\n"+a1.getCustFathername()+"\n"+a1.getCustGender()
//					 	+"\n"+a1.getCustAddress()+"\n"+a1.getCustState()+"\n"+a1.getCustZipcode()
//					 			);
//				 }
//			 
//		  } catch (CustomerException e) {System.out.println("My Class Exception"+e);}
//		  
	}

}

