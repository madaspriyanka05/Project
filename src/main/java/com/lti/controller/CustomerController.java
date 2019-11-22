
 package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.Exception.CustomerException;
import com.lti.Interface.NetBankingInterface;
import com.lti.entity.Beneficiary;
import com.lti.entity.Customer;
import com.lti.service.BeneficiaryService;
import com.lti.service.CustomerService;

/**
 * @author Priyanka Madas and Jyoti Dixit
 *
 */
@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
// No. of ways to write the register method to get the data from the jsp file
//public String register(HttpServletRequest request){
//public String register(@RequestParam("name") String name,@RequestParam("name") String name,...)  Use this when you have only two or three parameteres by max
//form data can be stored in the object directly, also the best method to do that
	
	@RequestMapping(path="/Register.lti",method=RequestMethod.POST)
	public String register(Customer cust) throws CustomerException
	{
		customerService.register(cust);
		System.out.println(cust);
		return "Login.jsp";
	}
	
//	@RequestMapping(path="Login.lti",method=RequestMethod.POST)
//	public String Login(Customer cust) throws CustomerException
//	{
//		
//		//customerService.logincheck(cust);
//		System.out.println(cust);
//		return "index.jsp";
//		
//	}
//	
	
	/***** FOR BENEFICIARY *****/
	
	@Autowired
	private BeneficiaryService beneficiaryinterface;
	
	@RequestMapping(path="/AddNewBeneficiary.lti",method=RequestMethod.POST)
	public String addB(Beneficiary b)
	{
		beneficiaryinterface.addBeneficiary(b);
		System.out.println(b);
		return "f_IMPS.jsp";
	}
	
	
	/***** FOR NET-BANKING *****/
	
	@Autowired
	private NetBankingInterface netbankinginterface;
	
	@RequestMapping(path="/AddNetBanking.lti",method=RequestMethod.POST)
	public String addNetBanking(Beneficiary b)
	{
		beneficiaryinterface.addBeneficiary(b);
		System.out.println(b);
		return "f_RTGS.jsp";
	}
	
}

	

