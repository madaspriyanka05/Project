package com.lti.Interface;

import java.util.List;

import com.lti.entity.NetBankAccount;

public interface NetBankingInterface {
	public void addNetBankingAcc(NetBankAccount netbankaccount);
	public List<NetBankAccount> getNetBankingAcc();
}
