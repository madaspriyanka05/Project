package com.lti.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import com.lti.Interface.BeneficiaryInterface;
import com.lti.entity.Account;
import com.lti.entity.Beneficiary;

@Component("benef")
public class BeneficiaryRepository implements BeneficiaryInterface {

	public void addNewBeneficiary(Beneficiary beneficiary) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			PreparedStatement stmt;
			stmt=con.prepareStatement("insert into beneficiary values (?, ?, ?)");
			stmt.setInt(1, beneficiary.getbAccId());
			stmt.setString(2, beneficiary.getName());
			stmt.setInt(3, beneficiary.getAccount().getAccountId());
			
			stmt.executeUpdate();
			
			//Resultset rs = stmt.executeQuery("select * from");
		}
		catch(Exception e)
		{
			
		}
	}

	public List<Beneficiary> getBeneficiaries() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Object fetchData(Class clazz, Object pk){
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em= emf.createEntityManager();
	
		//find method generates select query based on primary key; clazz is the class name
		Object obj = em.find(clazz, pk);
	
		em.close();
		emf.close();
	
		return obj; 
	}

}
