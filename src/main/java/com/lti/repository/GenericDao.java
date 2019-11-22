package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class GenericDao {
public void addP(Object obj){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
		
		EntityManager em= emf.createEntityManager();
		
		EntityTransaction tx= em.getTransaction();                            
		tx.begin();
		
		//em.persist(obj);
		
		//merge() can be used for insert and update operations both
		em.merge(obj);
		
		tx.commit();
		em.close();
		emf.close();
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
