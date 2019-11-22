package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.Exception.CustomerException;
import com.lti.Interface.BeneficiaryInterface;
import com.lti.Interface.CustomerInterface;
import com.lti.entity.Beneficiary;

public class BeneficiaryTest {

	@Test
	public void test() 
	{
		ApplicationContext ctx= new   ClassPathXmlApplicationContext("app-config.xml");
		BeneficiaryInterface  cp=(BeneficiaryInterface)  ctx.getBean("benef");
		
		Beneficiary b = new Beneficiary();
		
		try
		{
			cp.addNewBeneficiary(b);
		}
		catch( Exception e)
		{
			System.out.println(""+e);
		}
	}
}
