/*package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.Exception.CustomerException;
import com.lti.entity.Beneficiary;
import com.lti.entity.Customer;
import com.lti.service.BeneficiaryService;

@Controller
public class BeneficiaryController 
{
	@Autowired
	private BeneficiaryService beneficiaryinterface;
	
	@RequestMapping(path="/AddNewBeneficiary.lti",method=RequestMethod.POST)
	public String register(Beneficiary b) throws CustomerException
	{
		beneficiaryinterface.addBeneficiary(b);
		System.out.println(b);
		return "f_imps.jsp";
	}
}
*/