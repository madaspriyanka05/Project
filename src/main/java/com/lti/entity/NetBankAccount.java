package com.lti.entity;
/**
 * @author Priyanka and Jyoti
 * @Date 14-11-19
 *
 */


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="NetBankingAccount")
public class NetBankAccount 
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seq")
	@SequenceGenerator(sequenceName = "netbankaccount_seq", name = "seq", allocationSize = 1)
	
	private int id;
	private String username;
	private String netPassword;
	private String transactionPassword;
	private String securityQues;
	private String securityAns;
	
	
	@OneToOne
	@JoinColumn(name="accountId")
	private Account netbankingaccount;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getNetPassword() {
		return netPassword;
	}


	public void setNetPassword(String netPassword) {
		this.netPassword = netPassword;
	}


	public String getTransactionPassword() {
		return transactionPassword;
	}


	public void setTransactionPassword(String transactionPassword) {
		this.transactionPassword = transactionPassword;
	}


	public String getSecurityQues() {
		return securityQues;
	}


	public void setSecurityQues(String securityQues) {
		this.securityQues = securityQues;
	}


	public String getSecurityAns() {
		return securityAns;
	}


	public void setSecurityAns(String securityAns) {
		this.securityAns = securityAns;
	}


	public Account getNetbankingaccount() {
		return netbankingaccount;
	}


	public void setNetbankingaccount(Account netbankingaccount) {
		this.netbankingaccount = netbankingaccount;
	}
	
	
	
	
	
}
