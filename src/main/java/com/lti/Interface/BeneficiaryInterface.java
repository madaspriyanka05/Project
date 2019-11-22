package com.lti.Interface;

import java.util.List;

import com.lti.entity.Account;
import com.lti.entity.Beneficiary;

public interface BeneficiaryInterface 
{
	public void addNewBeneficiary(Beneficiary beneficiary);
	public List<Beneficiary> getBeneficiaries();
	
}
