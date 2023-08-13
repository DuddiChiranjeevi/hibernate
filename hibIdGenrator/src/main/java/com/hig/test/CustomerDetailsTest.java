package com.hig.test;

import com.hig.entities.CustomerDetails;
import com.hig.helper.PFRegistry;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class CustomerDetailsTest {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction=null;
		CustomerDetails customerDetails=null;
		try {
			entityManagerFactory = PFRegistry.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			
			 customerDetails = new CustomerDetails();
			customerDetails.setCustomerName("Duudi Chiranjeevi");
			customerDetails.setFatherName("Subramanyam");
			customerDetails.setSalary(50000);
			entityManager.persist(customerDetails);
			
			System.out.println("Customer Id:"+customerDetails.getCustomerId());
			transaction.commit();
			
		}finally {
			if(entityManager !=null) {
				entityManager.close();
				entityManager=null;
			}
		}
		
		PFRegistry.closeEntityManagerFactory();

		}

	}
