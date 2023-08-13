package com.oig.test;

import com.oig.entities.Product;
import com.oig.helper.PFRegistry;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class ProductTest {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		
		try {
			entityManagerFactory =PFRegistry.getEntityManagerFactory();
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			
			Product product=new Product();
			product.setProductName("Chocolate");
			product.setPrice(150);
			transaction.begin();
			entityManager.persist(product);
			product.getPrice();
			transaction.commit();
			System.out.println("Data inserted successfully in to Db ");
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}finally {
			
			if(entityManager !=null) {
				entityManager.close();
				entityManager=null;
			}
		}

	}

}
